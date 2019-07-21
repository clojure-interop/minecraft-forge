(ns net.minecraftforge.client.event.DrawBlockHighlightEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event DrawBlockHighlightEvent]))

(defn ->draw-block-highlight-event
  "Constructor.

  context - `net.minecraft.client.renderer.RenderGlobal`
  player - `net.minecraft.entity.player.EntityPlayer`
  target - `net.minecraft.util.math.RayTraceResult`
  sub-id - `int`
  partial-ticks - `float`"
  (^DrawBlockHighlightEvent [^net.minecraft.client.renderer.RenderGlobal context ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.math.RayTraceResult target ^Integer sub-id ^Float partial-ticks]
    (new DrawBlockHighlightEvent context player target sub-id partial-ticks)))

(defn get-context
  "returns: `net.minecraft.client.renderer.RenderGlobal`"
  (^net.minecraft.client.renderer.RenderGlobal [^DrawBlockHighlightEvent this]
    (-> this (.getContext))))

(defn get-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^DrawBlockHighlightEvent this]
    (-> this (.getPlayer))))

(defn get-target
  "returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^DrawBlockHighlightEvent this]
    (-> this (.getTarget))))

(defn get-sub-id
  "returns: `int`"
  (^Integer [^DrawBlockHighlightEvent this]
    (-> this (.getSubID))))

(defn get-partial-ticks
  "returns: `float`"
  (^Float [^DrawBlockHighlightEvent this]
    (-> this (.getPartialTicks))))

