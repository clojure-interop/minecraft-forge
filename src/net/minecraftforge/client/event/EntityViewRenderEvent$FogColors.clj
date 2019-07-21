(ns net.minecraftforge.client.event.EntityViewRenderEvent$FogColors
  "Event that allows any feature to customize the color of fog the player sees.
  NOTE: Any change made to one of the color variables will affect the result seen in-game."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event EntityViewRenderEvent$FogColors]))

(defn ->fog-colors
  "Constructor.

  renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  render-partial-ticks - `double`
  red - `float`
  green - `float`
  blue - `float`"
  (^EntityViewRenderEvent$FogColors [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Double render-partial-ticks ^Float red ^Float green ^Float blue]
    (new EntityViewRenderEvent$FogColors renderer entity state render-partial-ticks red green blue)))

(defn get-red
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$FogColors this]
    (-> this (.getRed))))

(defn set-red
  "red - `float`"
  ([^EntityViewRenderEvent$FogColors this ^Float red]
    (-> this (.setRed red))))

(defn get-green
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$FogColors this]
    (-> this (.getGreen))))

(defn set-green
  "green - `float`"
  ([^EntityViewRenderEvent$FogColors this ^Float green]
    (-> this (.setGreen green))))

(defn get-blue
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$FogColors this]
    (-> this (.getBlue))))

(defn set-blue
  "blue - `float`"
  ([^EntityViewRenderEvent$FogColors this ^Float blue]
    (-> this (.setBlue blue))))

