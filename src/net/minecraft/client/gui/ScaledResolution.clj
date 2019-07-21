(ns net.minecraft.client.gui.ScaledResolution
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui ScaledResolution]))

(defn ->scaled-resolution
  "Constructor.

  minecraft-client - `net.minecraft.client.Minecraft`"
  (^ScaledResolution [^net.minecraft.client.Minecraft minecraft-client]
    (new ScaledResolution minecraft-client)))

(defn get-scaled-width
  "returns: `int`"
  (^Integer [^ScaledResolution this]
    (-> this (.getScaledWidth))))

(defn get-scaled-height
  "returns: `int`"
  (^Integer [^ScaledResolution this]
    (-> this (.getScaledHeight))))

(defn get-scaled-width-double
  "returns: `double`"
  (^Double [^ScaledResolution this]
    (-> this (.getScaledWidth_double))))

(defn get-scaled-height-double
  "returns: `double`"
  (^Double [^ScaledResolution this]
    (-> this (.getScaledHeight_double))))

(defn get-scale-factor
  "returns: `int`"
  (^Integer [^ScaledResolution this]
    (-> this (.getScaleFactor))))

