Project2 內容：使用 antlr 實作 parser

token 內容寫在 word 檔中

parser 目前支援 if-then, if-then-else, if-else, if-elseif-else, for, while, do while, return, const
                switch, compare operator(>, <, ==, !=, >=, <=), include STD library、多個參數的且名稱可為 id 的 function, printf 多個參數
                +=, -=, *=, %=, ++, --, char(type), 'c'(const character), 陣列宣告, 陣列賦值, string, brreak, continue;

編譯：用 terminal，並走到資料夾下輸入 make，即可編譯。
執行：輸入 make run 可以測試三個 c 程式，若要測試其他的可以輸入 java -cp ./antlr-4.12.0-complete.jar:. testParser filename.c
欲檢查錯誤有無發生可以使用 `grep line` 去檢查，ex: `make run | grep line`

reference： 
    https://tomassetti.me/antlr-mega-tutorial/
    https://stackoverflow.com/questions/43030478/attribute-references-not-allowed-in-lexer-actions
