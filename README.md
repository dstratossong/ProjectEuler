# project-euler

Solutions to Project Euler problems, in both Java and Clojure languages. The solutions are written by Arshan Alam, and David Song, both computer science students of the University of Waterloo.

## Usage

### Clojure (with Lein)

The Clojure sources are packaged using Leiningen. In each problem namespace, there are always two variables defined: `problem` and `solution`. `problem` is a string containing a paraphrasing of the original problem; `solution` is a number that is the correct solution of the problem, tested against Project Euler. There are the following useful commands:

```Bash
lein test          # run against defined tests
lein repl          # gets the REPL
```

After getting the REPL, you can interact with the project:

```Clojure
(require 'project-euler.problem-1)         ; put into scope
project-euler.problem-1/problem            ; gets the problem text
project-euler.problem-1/solution           ; gets the solution
(source project-euler.problem-1/solution)  ; check source
```

## License

Copyright © 2015

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
