"""
# Shortest Word

Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
"""

def find_short(s):
    shortest = len(s.split(' ', 1)[0])
    for word in s.split():
        if len(word) < shortest:
            shortest = len(word)
    return shortest
