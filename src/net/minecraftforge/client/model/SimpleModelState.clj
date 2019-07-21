(ns net.minecraftforge.client.model.SimpleModelState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model SimpleModelState]))

(defn ->simple-model-state
  "Constructor.

  map - `com.google.common.collect.ImmutableMap`
  def - `com.google.common.base.Optional`"
  (^SimpleModelState [^com.google.common.collect.ImmutableMap map ^com.google.common.base.Optional def]
    (new SimpleModelState map def))
  (^SimpleModelState [^com.google.common.collect.ImmutableMap map]
    (new SimpleModelState map)))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^SimpleModelState this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

