(ns net.minecraft.entity.IJumpingMount
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity IJumpingMount]))

(defn set-jump-power
  "jump-power-in - `int`"
  ([^IJumpingMount this ^Integer jump-power-in]
    (-> this (.setJumpPower jump-power-in))))

(defn can-jump?
  "returns: `boolean`"
  (^Boolean [^IJumpingMount this]
    (-> this (.canJump))))

(defn handle-start-jump
  "p-184775-1 - `int`"
  ([^IJumpingMount this ^Integer p-184775-1]
    (-> this (.handleStartJump p-184775-1))))

(defn handle-stop-jump
  ""
  ([^IJumpingMount this]
    (-> this (.handleStopJump))))

