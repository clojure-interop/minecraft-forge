(ns net.minecraftforge.client.event.RenderPlayerEvent$SetArmorModel
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderPlayerEvent$SetArmorModel]))

(defn ->set-armor-model
  "Constructor.

  Deprecated.

  player - `net.minecraft.entity.player.EntityPlayer`
  renderer - `net.minecraft.client.renderer.entity.RenderPlayer`
  slot - `int`
  partial-tick - `float`
  stack - `net.minecraft.item.ItemStack`"
  (^RenderPlayerEvent$SetArmorModel [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.client.renderer.entity.RenderPlayer renderer ^Integer slot ^Float partial-tick ^net.minecraft.item.ItemStack stack]
    (new RenderPlayerEvent$SetArmorModel player renderer slot partial-tick stack)))

(defn get-result-value
  "Deprecated.

  returns: `int`"
  (^Integer [^RenderPlayerEvent$SetArmorModel this]
    (-> this (.getResultValue))))

(defn set-result
  "Deprecated.

  result - `int`"
  ([^RenderPlayerEvent$SetArmorModel this ^Integer result]
    (-> this (.setResult result))))

(defn get-slot
  "Deprecated.

  returns: `int`"
  (^Integer [^RenderPlayerEvent$SetArmorModel this]
    (-> this (.getSlot))))

(defn get-stack
  "Deprecated.

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RenderPlayerEvent$SetArmorModel this]
    (-> this (.getStack))))

