(ns net.minecraft.network.ThreadQuickExitException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network ThreadQuickExitException]))

(def *-instance
  "Static Constant.

  type: net.minecraft.network.ThreadQuickExitException"
  ThreadQuickExitException/INSTANCE)

(defn fill-in-stack-trace
  "returns: `java.lang.Throwable`"
  (^java.lang.Throwable [^ThreadQuickExitException this]
    (-> this (.fillInStackTrace))))

