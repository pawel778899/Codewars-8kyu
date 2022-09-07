def digitize(n):
    return [int(s) for s in str(n)][::-1]


print(digitize(35231))




# DESCRIPTION:
# Convert number to reversed array of digits
# Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

# Example(Input => Output):
# 35231 => [1,3,2,5,3]
# 0 => [0]
# ARRAYSFUNDAMENTALS
