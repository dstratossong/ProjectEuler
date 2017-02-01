# project-euler

Solutions to Project Euler problems, in Clojure, authored by David Song.

## Usage

The Clojure sources are packaged using Leiningen, and lies in the directory `src/project_euler`. In each problem namespace, there are always two variables and a function defined:

- `problem`, a string containing a paraphrasing of the original problem
- `solution`, a number that is the correct solution of the problem, tested against Project Euler.
- `solver`, a function that takes some parameter that solves a more general problem than that which is specified

Furthermore, with each problem, there are simple test suites defined in the directory `test/project_euler`. These are some useful commands:

```Bash
lein test          # run against defined tests
lein repl          # gets the REPL
```

After getting the REPL, you can interact with the project:

```Clojure
(require 'project-euler.problem-1)         ; put into scope
project-euler.problem-1/problem            ; gets the problem text
(project-euler.problem-1/solution)         ; gets the solution
(doc project-euler.problem-1/solver)       ; gets the general problem
(source project-euler.problem-1/solver)    ; check its source
```

## License

Copyright © 2015

Distributed under the Eclipse Public License.
