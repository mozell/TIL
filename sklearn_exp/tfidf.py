from sklearn.feature_extraction.text import TfidfVectorizer

corpus = [
    'This is   the   first  document.',
    'This is   the   second second   document.',
    'And  the  third one.',
    'Is   this the   first  document?',
    'The  last       document?',
]


tfidf = TfidfVectorizer().fit(corpus)
a = tfidf.transform(corpus).toarray()
print(a)