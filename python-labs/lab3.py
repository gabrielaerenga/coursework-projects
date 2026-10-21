import sys

question_words = ["what", "where", "how", "why", "who", "when"]
pronouns = ["he", "she", "it", "they"]

def is_statement(line):
    line = line.strip()

    if line == "":
        return False

    if line.endswith("?"):
        return False

    words = line.split()

    if len(words) == 1:
        return False

    first_word = words[0].lower()
    if first_word in question_words:
        return False

    for word in words:
        word = word.lower().strip(".,!?")
        if word in pronouns:
            return False

    return True


def main():

    if len(sys.argv) < 2:
        print("Error: missing input file name.")
        print("Usage: python program.py <filename>")
        return

    filename = sys.argv[1]

    try:
        file = open(filename, "r")

        for line in file:
            if is_statement(line):
                print(line.rstrip(), "STATEMENT")
            else:
                print(line.rstrip(), "NOT A STATEMENT")

        file.close()

    except:
        print("Error: could not open file.")


main()
