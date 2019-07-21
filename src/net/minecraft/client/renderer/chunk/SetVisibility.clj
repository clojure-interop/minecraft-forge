(ns net.minecraft.client.renderer.chunk.SetVisibility
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.chunk SetVisibility]))

(defn ->set-visibility
  "Constructor."
  (^SetVisibility []
    (new SetVisibility )))

(defn set-many-visible
  "facing - `java.util.Set`"
  ([^SetVisibility this ^java.util.Set facing]
    (-> this (.setManyVisible facing))))

(defn set-visible
  "facing - `net.minecraft.util.EnumFacing`
  facing-2 - `net.minecraft.util.EnumFacing`
  p-178619-3 - `boolean`"
  ([^SetVisibility this ^net.minecraft.util.EnumFacing facing ^net.minecraft.util.EnumFacing facing-2 ^Boolean p-178619-3]
    (-> this (.setVisible facing facing-2 p-178619-3))))

(defn set-all-visible
  "visible - `boolean`"
  ([^SetVisibility this ^Boolean visible]
    (-> this (.setAllVisible visible))))

(defn visible?
  "facing - `net.minecraft.util.EnumFacing`
  facing-2 - `net.minecraft.util.EnumFacing`

  returns: `boolean`"
  (^Boolean [^SetVisibility this ^net.minecraft.util.EnumFacing facing ^net.minecraft.util.EnumFacing facing-2]
    (-> this (.isVisible facing facing-2))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SetVisibility this]
    (-> this (.toString))))

