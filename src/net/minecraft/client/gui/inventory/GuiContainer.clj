(ns net.minecraft.client.gui.inventory.GuiContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiContainer]))

(defn ->gui-container
  "Constructor.

  inventory-slots-in - `net.minecraft.inventory.Container`"
  (^GuiContainer [^net.minecraft.inventory.Container inventory-slots-in]
    (new GuiContainer inventory-slots-in)))

(def *-inventory-background
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  GuiContainer/INVENTORY_BACKGROUND)

(defn inventory-slots
  "Instance Field.

  type: net.minecraft.inventory.Container"
  (^net.minecraft.inventory.Container [^GuiContainer this]
    (-> this .-inventorySlots)))

(defn does-gui-pause-game
  "returns: `boolean`"
  (^Boolean [^GuiContainer this]
    (-> this (.doesGuiPauseGame))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiContainer this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn get-x-size
  "returns: `int`"
  (^Integer [^GuiContainer this]
    (-> this (.getXSize))))

(defn update-screen
  ""
  ([^GuiContainer this]
    (-> this (.updateScreen))))

(defn on-gui-closed
  ""
  ([^GuiContainer this]
    (-> this (.onGuiClosed))))

(defn get-gui-left
  "returns: `int`"
  (^Integer [^GuiContainer this]
    (-> this (.getGuiLeft))))

(defn get-gui-top
  "returns: `int`"
  (^Integer [^GuiContainer this]
    (-> this (.getGuiTop))))

(defn init-gui
  ""
  ([^GuiContainer this]
    (-> this (.initGui))))

(defn get-slot-under-mouse
  "Returns the slot that is currently displayed under the mouse.

  returns: `net.minecraft.inventory.Slot`"
  (^net.minecraft.inventory.Slot [^GuiContainer this]
    (-> this (.getSlotUnderMouse))))

(defn get-y-size
  "returns: `int`"
  (^Integer [^GuiContainer this]
    (-> this (.getYSize))))

