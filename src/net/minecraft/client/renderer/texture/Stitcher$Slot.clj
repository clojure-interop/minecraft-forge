(ns net.minecraft.client.renderer.texture.Stitcher$Slot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.texture Stitcher$Slot]))

(defn ->slot
  "Constructor.

  origin-x-in - `int`
  origin-y-in - `int`
  width-in - `int`
  height-in - `int`"
  (^Stitcher$Slot [^Integer origin-x-in ^Integer origin-y-in ^Integer width-in ^Integer height-in]
    (new Stitcher$Slot origin-x-in origin-y-in width-in height-in)))

(defn get-stitch-holder
  "returns: `net.minecraft.client.renderer.texture.Stitcher$Holder`"
  (^net.minecraft.client.renderer.texture.Stitcher$Holder [^Stitcher$Slot this]
    (-> this (.getStitchHolder))))

(defn get-origin-x
  "returns: `int`"
  (^Integer [^Stitcher$Slot this]
    (-> this (.getOriginX))))

(defn get-origin-y
  "returns: `int`"
  (^Integer [^Stitcher$Slot this]
    (-> this (.getOriginY))))

(defn add-slot
  "holder-in - `net.minecraft.client.renderer.texture.Stitcher$Holder`

  returns: `boolean`"
  (^Boolean [^Stitcher$Slot this ^net.minecraft.client.renderer.texture.Stitcher$Holder holder-in]
    (-> this (.addSlot holder-in))))

(defn get-all-stitch-slots
  "p-94184-1 - `java.util.List`"
  ([^Stitcher$Slot this ^java.util.List p-94184-1]
    (-> this (.getAllStitchSlots p-94184-1))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Stitcher$Slot this]
    (-> this (.toString))))

