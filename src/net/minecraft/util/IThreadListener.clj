(ns net.minecraft.util.IThreadListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util IThreadListener]))

(defn add-scheduled-task
  "runnable-to-schedule - `java.lang.Runnable`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^IThreadListener this ^java.lang.Runnable runnable-to-schedule]
    (-> this (.addScheduledTask runnable-to-schedule))))

(defn calling-from-minecraft-thread?
  "returns: `boolean`"
  (^Boolean [^IThreadListener this]
    (-> this (.isCallingFromMinecraftThread))))

