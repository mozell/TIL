from random import randint

state = [[-1, -1, -1, -1, -1, -1],
         [-1,  1, -1,  0,  0, -1],
         [-1,  0,  0,  0, -1, -1],
         [-1,  0, -1,  0,  0, -1],
         [-1,  0, -1, -1,100, -1],
         [-1, -1, -1, -1, -1, -1]]

Q = [[[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]],
     [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]],
     [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]],
     [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]],
     [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]],
     [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]]

num_episode = 50 # 에피소드..
_A = 0.01 # 학습률
_G = 0.9  # 감마값
_E = 0.1  # 엡실론

# Q(S,A) A - x++, x--, y++, y--
# action x++ : 0 (Right)
#        x-- : 1 (Left)
#        y++ : 2 (Up)
#        y-- : 3 (Down)

init_state_x = 1
init_state_y = 1

select_action = randint(0,3)

#배우는건 될거 같은데 움직이고나서의 상태변화를 어떻게 처리..???
#https://github.com/rlcode/reinforcement-learning-kr/blob/master/1-grid-world/5-q-learning/q_learning_agent.py
def learn(sx, sy, action):
    current_q = Q[sx][sy][action]

    select_next_state = randint(0, 3)
    if select_next_state == 0:
        nsx = sx + 1
        nsy = sy
    elif select_next_state == 1:
        nsx = sx - 1
        nsy = sy
    elif select_next_state == 2:
        nsx = sx
        nsy = sy + 1
    elif select_next_state == 3:
        nsx = sx
        nsy = sy - 1

    next_state_q = Q[nsx][nsy][randint(0,3)]
    new_q = (current_q + _A *(state[sx][sy] + _G * next_state_q - current_q ))
    Q[sx][sy][action] = new_q
# q learning
# def Qlearn(sx, sy, action):
    # q1 = Q[sx][sy][action]
    #
    # # 한번 더 가는거?
    # select_next_state = randint(0,3)
    # if select_next_state == 0:
    #     nsx = sx+1
    #     nsy = sy
    # elif select_next_state == 1:
    #     nsx = sx-1
    #     nsy = sy
    # elif select_next_state == 2:
    #     nsx = sx
    #     nsy = sy+1
    # elif select_next_state == 3:
    #     nsx = sx
    #     nsy = sy-1
    #
    # if action == 0 : # Right
    #     reward = state[sx+1][sy]
    #     q2 = reward + _G * max(Q[nsx][nsy])
    #     Q[sx][sy][action] += _A * (q2 - q1)
    # elif action == 1 : # Left
    #     reward = state[sx-1][sy]
    #     q2 = reward + _G * max(Q[nsx][nsy])
    #     Q[sx][sy][action] += _A * (q2 - q1)
    # elif action == 2 : # Up
    #     reward = state[sx][sy+1]
    #     q2 = reward + _G * max(Q[nsx][nsy])
    #     Q[sx][sy][action] += _A * (q2 - q1)
    # elif action == 3 : # Down
    #     reward = state[sx][sy-1]
    #     q2 = reward + _G * max(Q[nsx][nsy])
    #     Q[sx][sy][action] += _A * (q2 - q1)

for i in range(num_episode):# 가장 높은거중에 랜덤으로..
    select_action = randint(0,3)
    learn(init_state_x, init_state_y, select_action)

print(Q)