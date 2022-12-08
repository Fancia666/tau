from scipy.spatial.distance import hamming


def distance(string1, string2):
    if string1 == "" and string2 == "":
        return 0
    hamming_distance = hamming(list(string1), list(string2)) * len(string1)
    return hamming_distance
