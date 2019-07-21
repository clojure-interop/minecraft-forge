(ns net.minecraftforge.client.model.MapModelState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model MapModelState]))

(defn ->map-model-state
  "Constructor.

  map - `java.util.Map`
  def - `net.minecraftforge.common.model.TRSRTransformation`"
  (^MapModelState [^java.util.Map map ^net.minecraftforge.common.model.TRSRTransformation def]
    (new MapModelState map def))
  (^MapModelState [^java.util.Map map]
    (new MapModelState map)))

(defn *wrap
  "obj - `java.lang.Object`

  returns: `net.minecraftforge.client.model.MapModelState$Wrapper`"
  (^net.minecraftforge.client.model.MapModelState$Wrapper [^java.lang.Object obj]
    (MapModelState/wrap obj)))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^MapModelState this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

(defn get-state
  "obj - `java.lang.Object`

  returns: `net.minecraftforge.common.model.IModelState`"
  (^net.minecraftforge.common.model.IModelState [^MapModelState this ^java.lang.Object obj]
    (-> this (.getState obj))))

