SRC = $(shell find ./src/main/java/ -type f -name '*.java' -print)
OBJ = ./obj
BIN = ./bin

.PHONY: run
run: $(BIN)/hello.jar
	dalvikvm -cp $(BIN)/hello.jar HelloWorld

$(BIN)/hello.jar: $(SRC)
	mkdir -p $(OBJ)/
	ecj -d $(OBJ)/ $(SRC)
	mkdir -p $(BIN)/
	dx --dex --output=$(BIN)/hello.jar $(OBJ)/

.PHONY: clean
clean:
	rm -rf ./oat/ $(BIN)/ $(OBJ)/

