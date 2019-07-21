(ns net.minecraftforge.client.event.RenderSpecificHandEvent
  "This event is fired on the MinecraftForge.EVENT_BUS
  whenever a hand is rendered in first person.
  Canceling the event causes the hand to not render.
  TODO This may get merged in 11 with RenderHandEvent to make a generic hand rendering"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderSpecificHandEvent]))

(defn ->render-specific-hand-event
  "Constructor.

  hand - `net.minecraft.util.EnumHand`
  partial-ticks - `float`
  interpolated-pitch - `float`
  swing-progress - `float`
  equip-progress - `float`
  stack - `net.minecraft.item.ItemStack`"
  (^RenderSpecificHandEvent [^net.minecraft.util.EnumHand hand ^Float partial-ticks ^Float interpolated-pitch ^Float swing-progress ^Float equip-progress ^net.minecraft.item.ItemStack stack]
    (new RenderSpecificHandEvent hand partial-ticks interpolated-pitch swing-progress equip-progress stack)))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^RenderSpecificHandEvent this]
    (-> this (.getHand))))

(defn get-partial-ticks
  "returns: `float`"
  (^Float [^RenderSpecificHandEvent this]
    (-> this (.getPartialTicks))))

(defn get-interpolated-pitch
  "returns: The interpolated pitch of the player entity - `float`"
  (^Float [^RenderSpecificHandEvent this]
    (-> this (.getInterpolatedPitch))))

(defn get-swing-progress
  "returns: The swing progress of the hand being rendered - `float`"
  (^Float [^RenderSpecificHandEvent this]
    (-> this (.getSwingProgress))))

(defn get-equip-progress
  "returns: The progress of the equip animation. 1.0 is fully equipped. - `float`"
  (^Float [^RenderSpecificHandEvent this]
    (-> this (.getEquipProgress))))

(defn get-item-stack
  "returns: The ItemStack to be rendered, or null. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^RenderSpecificHandEvent this]
    (-> this (.getItemStack))))

