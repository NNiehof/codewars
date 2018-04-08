"""
# Is this a triangle?

Implement a method that accepts 3 integer values a, b, c. The method should
return true if a triangle can be built with the sides of given length and
false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).
"""


def is_triangle(a, b, c):
    """Return true if a triangle can be built with side lengths a, b, c."""
    sides = [a, b, c]
    sides.sort()

    # side lengths may not be negative or zero, check the smallest side
    if sides[0] <= 0:
        return False

    # sum of the two smaller sides must be larger than the longest side
    if sides[0] + sides[1] > sides[2]:
        return True

    return False