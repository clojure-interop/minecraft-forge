(ns net.minecraftforge.fml.common.toposort.TopologicalSort
  "Topological sort for mod loading

  Based on a variety of sources, including http://keithschwarz.com/interesting/code/?dir=topological-sort"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.toposort TopologicalSort]))

(defn ->topological-sort
  "Constructor."
  (^TopologicalSort []
    (new TopologicalSort )))

(defn *topological-sort
  "Sort the input graph into a topologically sorted list

   Uses the reverse depth first search as outlined in ...

  graph - `net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph`

  returns: The sorted mods list. - `<T> java.util.List<T>`"
  ([^net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph graph]
    (TopologicalSort/topologicalSort graph)))

(defn *reverse
  "graph - `net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph`

  returns: `<T> net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph<T>`"
  ([^net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph graph]
    (TopologicalSort/reverse graph)))

(defn *explore
  "node - `T`
  graph - `net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph`
  sorted-result - `java.util.List`
  visited-nodes - `java.util.Set`
  expanded-nodes - `java.util.Set`

  returns: `<T> void`"
  ([node ^net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph graph ^java.util.List sorted-result ^java.util.Set visited-nodes ^java.util.Set expanded-nodes]
    (TopologicalSort/explore node graph sorted-result visited-nodes expanded-nodes)))

