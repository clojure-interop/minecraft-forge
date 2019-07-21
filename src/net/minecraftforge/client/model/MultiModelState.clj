(ns net.minecraftforge.client.model.MultiModelState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model MultiModelState]))

(defn ->multi-model-state
  "Constructor.

  states - `com.google.common.collect.ImmutableList`"
  (^MultiModelState [^com.google.common.collect.ImmutableList states]
    (new MultiModelState states)))

(defn *get-part-state
  "state - `net.minecraftforge.common.model.IModelState`
  model - `net.minecraftforge.client.model.IModel`
  index - `int`

  returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^net.minecraftforge.common.model.IModelState state ^net.minecraftforge.client.model.IModel model ^Integer index]
    (MultiModelState/getPartState state model index)))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^MultiModelState this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

