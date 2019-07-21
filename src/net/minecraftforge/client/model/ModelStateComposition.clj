(ns net.minecraftforge.client.model.ModelStateComposition
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelStateComposition]))

(defn ->model-state-composition
  "Constructor.

  first - `net.minecraftforge.common.model.IModelState`
  second - `net.minecraftforge.common.model.IModelState`"
  (^ModelStateComposition [^net.minecraftforge.common.model.IModelState first ^net.minecraftforge.common.model.IModelState second]
    (new ModelStateComposition first second)))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^ModelStateComposition this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ModelStateComposition this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ModelStateComposition this]
    (-> this (.hashCode))))

