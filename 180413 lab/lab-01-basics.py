###################
##  https://github.com/hunkim/DeepLearningZeroToAll/
###################

import tensorflow as tf
tf.__version__

# Create a constant op
# This op is added as a node to the default graph
hello = tf.constant("Hello, TensorFlow!") # string형식의 constant value를 갖는 변수(노드) 생성

# start a TF session
sess = tf.Session() # 하나의 session에 하나의 graph가 존재

# run the op and get result
print(sess.run(hello))

# a rank 0 tensor; this is a scalar with shape []
[1. ,2., 3.] # a rank 1 tensor; this is a vector with shape [3]
[[1., 2., 3.], [4., 5., 6.]] # a rank 2 tensor; a matrix with shape [2, 3]
[[[1., 2., 3.]], [[7., 8., 9.]]] # a rank 3 tensor with shape [2, 1, 3]



#tf 연산을 사용하여 그래프 빌드
node1 = tf.constant(3.0, tf.float32)
node2 = tf.constant(4.0) # also tf.float32 implicitly
node3 = tf.add(node1, node2)

#데이터를 넣고 그래프 실행 (sess.run(op))
print("node1:", node1, "node2:", node2)
print("node3: ", node3)

#그래프의 변수 값들을 업데이트( and return values )
sess = tf.Session()
print("sess.run(node1, node2): ", sess.run([node1, node2]))
print("sess.run(node3): ", sess.run(node3))

a = tf.placeholder(tf.float32) # 변수의 형태만 정해놓고, 변수의 값은 텐서플로우가 실행되는 동안에 정해짐
b = tf.placeholder(tf.float32)
adder_node = a + b  # + provides a shortcut for tf.add(a, b)

print(sess.run(adder_node, feed_dict={a: 3, b: 4.5}))
print(sess.run(adder_node, feed_dict={a: [1,3], b: [2, 4]}))

add_and_triple = adder_node * 3.
print(sess.run(add_and_triple, feed_dict={a: 3, b:4.5}))