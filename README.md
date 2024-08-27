# Eval CLJS

Evaluate ClojureScript code from JavaScript

Wraps [org.babashka/sci.core/eval-string](https://github.com/babashka/sci/blob/master/API.md#sci.core/eval-string)

## Usage

```sh
npm i eval-cljs
```

```js
import { evaluate } from "eval-cljs";

let input = `(println "Hello")
             (println "World")
             (+ 2 2)`;
let [evalOutput, printOutput] = evaluate(input);

console.log(printOutput); // [ 'Hello', 'World' ]
console.log(evalOutput);  // 4
```