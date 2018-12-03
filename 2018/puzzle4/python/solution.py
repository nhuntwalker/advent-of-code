from collections import Counter

if __name__ == "__main__":
    with open('../input.txt') as data:
        box_ids = data.readlines()
        found = False
        for i, box_id in enumerate(box_ids):
            if found:
                break
            for j, comp_id in enumerate(box_ids):
                if i != j and len(box_id) == len(comp_id):
                    id1 = list(box_id.strip())
                    id2 = list(comp_id.strip())
                    diff = 0
                    diff_idx = 0
                    for k in range(len(id1)):
                        if id1[k] != id2[k]:
                            diff += 1
                            diff_idx = k

                    if diff == 1:
                        found = True
                        break

        print(f"Similar letters: {comp_id[:diff_idx]}{comp_id[diff_idx+1:]}")


