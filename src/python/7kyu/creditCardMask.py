"""
# Credit Card Mask

Usually when you buy something, you're asked whether your credit card number,
phone number or answer to your most secret question is still correct. However,
since someone could look over your shoulder, you don't want that shown on your
screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four
characters into '#'.
"""


def maskify(cc):
    cc_length = len(cc)
    upper_index = cc_length
    lower_index = cc_length - 4
    if lower_index < 0:
        lower_index = 0

    return ("#" * (cc_length - 4)) + cc[lower_index:upper_index]