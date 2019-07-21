(ns net.minecraftforge.client.event.GuiScreenEvent$PotionShiftEvent
  "This event fires in InventoryEffectRenderer.updateActivePotionEffects()
  when potion effects are active and the gui wants to move over.
  Cancel this event to prevent the Gui from being moved."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event GuiScreenEvent$PotionShiftEvent]))

(defn ->potion-shift-event
  "Constructor.

  gui - `net.minecraft.client.gui.GuiScreen`"
  (^GuiScreenEvent$PotionShiftEvent [^net.minecraft.client.gui.GuiScreen gui]
    (new GuiScreenEvent$PotionShiftEvent gui)))

