(ns net.minecraftforge.common.model.IModelState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model IModelState]))

(defn apply
  "part - `com.google.common.base.Optional`

  returns: `com.google.common.base.Optional<net.minecraftforge.common.model.TRSRTransformation>`"
  (^com.google.common.base.Optional [^IModelState this ^com.google.common.base.Optional part]
    (-> this (.apply part))))

