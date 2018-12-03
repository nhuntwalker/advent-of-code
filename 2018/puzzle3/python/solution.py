from collections import Counter

if __name__ == "__main__":
    with open('../input.txt') as box_ids:
        two_ct = 0
        three_ct = 0

        while True:
            line = box_ids.readline()
            if not line:
                break
            counter = Counter(line)
            if 2 in counter.values():
                two_ct += 1
            if 3 in counter.values():
                three_ct += 1

        print(f'The final checksum is {two_ct * three_ct}')