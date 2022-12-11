import unittest
from Carol import recite


class TwelveDaysTest(unittest.TestCase):
    def test_first_verse(self):
        expected = [
            "On the first day of Christmas my true love gave to me: "
            "a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(1, 1), expected)

    def test_second_verse(self):
        expected = [
            "On the second day of Christmas my true love gave to me: "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(2, 2), expected)

    def test_third_verse(self):
        expected = [
            "On the third day of Christmas my true love gave to me: "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(3, 3), expected)

    def test_fourth_verse(self):
        expected = [
            "On the fourth day of Christmas my true love gave to me: "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(4, 4), expected)

    def test_fifth_verse(self):
        expected = [
            "On the fifth day of Christmas my true love gave to me: "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(5, 5), expected)

    def test_sixth_verse(self):
        expected = [
            "On the sixth day of Christmas my true love gave to me: "
            "six Geese-a-Laying, "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(6, 6), expected)

    def test_seventh_verse(self):
        expected = [
            "On the seventh day of Christmas my true love gave to me: "
            "seven Swans-a-Swimming, "
            "six Geese-a-Laying, "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(7, 7), expected)

    def test_eighth_verse(self):
        expected = [
            "On the eighth day of Christmas my true love gave to me: "
            "eight Maids-a-Milking, "
            "seven Swans-a-Swimming, "
            "six Geese-a-Laying, "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(8, 8), expected)

    def test_ninth_verse(self):
        expected = [
            "On the ninth day of Christmas my true love gave to me: "
            "nine Ladies Dancing, "
            "eight Maids-a-Milking, "
            "seven Swans-a-Swimming, "
            "six Geese-a-Laying, "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(9, 9), expected)

    def test_tenth_verse(self):
        expected = [
            "On the tenth day of Christmas my true love gave to me: "
            "ten Lords-a-Leaping, "
            "nine Ladies Dancing, "
            "eight Maids-a-Milking, "
            "seven Swans-a-Swimming, "
            "six Geese-a-Laying, "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(10, 10), expected)

    def test_eleventh_verse(self):
        expected = [
            "On the eleventh day of Christmas my true love gave to me: "
            "eleven Pipers Piping, "
            "ten Lords-a-Leaping, "
            "nine Ladies Dancing, "
            "eight Maids-a-Milking, "
            "seven Swans-a-Swimming, "
            "six Geese-a-Laying, "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(11, 11), expected)

    def test_twelfth_verse(self):
        expected = [
            "On the twelfth day of Christmas my true love gave to me: "
            "twelve Drummers Drumming, "
            "eleven Pipers Piping, "
            "ten Lords-a-Leaping, "
            "nine Ladies Dancing, "
            "eight Maids-a-Milking, "
            "seven Swans-a-Swimming, "
            "six Geese-a-Laying, "
            "five Gold Rings, "
            "four Calling Birds, "
            "three French Hens, "
            "two Turtle Doves, "
            "and a Partridge in a Pear Tree."
        ]
        self.assertEqual(recite(12, 12), expected)

    def test_whole_song(self):
        expected = [recite(i, i)[0] for i in range(1, 13)]
        self.assertEqual(recite(1, 12), expected)
