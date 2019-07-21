(ns net.minecraftforge.client.event.RenderGameOverlayEvent$BossInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderGameOverlayEvent$BossInfo]))

(defn ->boss-info
  "Constructor.

  parent - `net.minecraftforge.client.event.RenderGameOverlayEvent`
  type - `net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType`
  boss-info - `net.minecraft.world.BossInfoLerping`
  x - `int`
  y - `int`
  increment - `int`"
  (^RenderGameOverlayEvent$BossInfo [^net.minecraftforge.client.event.RenderGameOverlayEvent parent ^net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType type ^net.minecraft.world.BossInfoLerping boss-info ^Integer x ^Integer y ^Integer increment]
    (new RenderGameOverlayEvent$BossInfo parent type boss-info x y increment)))

(defn get-boss-info
  "returns: The BossInfoLerping currently being rendered - `net.minecraft.world.BossInfoLerping`"
  (^net.minecraft.world.BossInfoLerping [^RenderGameOverlayEvent$BossInfo this]
    (-> this (.getBossInfo))))

(defn get-x
  "returns: The current x position we are rendering at - `int`"
  (^Integer [^RenderGameOverlayEvent$BossInfo this]
    (-> this (.getX))))

(defn get-y
  "returns: The current y position we are rendering at - `int`"
  (^Integer [^RenderGameOverlayEvent$BossInfo this]
    (-> this (.getY))))

(defn get-increment
  "returns: How much to move down before rendering the next bar - `int`"
  (^Integer [^RenderGameOverlayEvent$BossInfo this]
    (-> this (.getIncrement))))

(defn set-increment
  "Sets the amount to move down before rendering the next bar

  increment - The increment to set - `int`"
  ([^RenderGameOverlayEvent$BossInfo this ^Integer increment]
    (-> this (.setIncrement increment))))

