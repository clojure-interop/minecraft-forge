(ns net.minecraftforge.fml.common.toposort.TopologicalSort$DirectedGraph
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.toposort TopologicalSort$DirectedGraph]))

(defn ->directed-graph
  "Constructor."
  (^TopologicalSort$DirectedGraph []
    (new TopologicalSort$DirectedGraph )))

(defn edges-from
  "from - `T`

  returns: `java.util.Set<T>`"
  (^java.util.Set [^TopologicalSort$DirectedGraph this from]
    (-> this (.edgesFrom from))))

(defn edge-exists
  "from - `T`
  to - `T`

  returns: `boolean`"
  (^Boolean [^TopologicalSort$DirectedGraph this from to]
    (-> this (.edgeExists from to))))

(defn add-node
  "node - `T`

  returns: `boolean`"
  (^Boolean [^TopologicalSort$DirectedGraph this node]
    (-> this (.addNode node))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TopologicalSort$DirectedGraph this]
    (-> this (.toString))))

(defn iterator
  "returns: `java.util.Iterator<T>`"
  (^java.util.Iterator [^TopologicalSort$DirectedGraph this]
    (-> this (.iterator))))

(defn remove-edge
  "from - `T`
  to - `T`"
  ([^TopologicalSort$DirectedGraph this from to]
    (-> this (.removeEdge from to))))

(defn add-edge
  "from - `T`
  to - `T`"
  ([^TopologicalSort$DirectedGraph this from to]
    (-> this (.addEdge from to))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^TopologicalSort$DirectedGraph this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^TopologicalSort$DirectedGraph this]
    (-> this (.size))))

