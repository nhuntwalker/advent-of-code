"""Advent of Code, Puzzle 1 solution."""
if __name__ == "__main__":
    with open('input.txt') as data:
        total = sum([int(number) for number in data.readlines()])
        print(f"The total change in frequency is +{total}" if total > 0 else f"The total change in frequency is {total}")
