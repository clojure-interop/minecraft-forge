(ns net.minecraft.client.gui.GuiScreenBook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiScreenBook]))

(defn ->gui-screen-book
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  book - `net.minecraft.item.ItemStack`
  is-unsigned - `boolean`"
  (^GuiScreenBook [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack book ^Boolean is-unsigned]
    (new GuiScreenBook player book is-unsigned)))

(defn update-screen
  ""
  ([^GuiScreenBook this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiScreenBook this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiScreenBook this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiScreenBook this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn get-clicked-component-at
  "p-175385-1 - `int`
  p-175385-2 - `int`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^GuiScreenBook this ^Integer p-175385-1 ^Integer p-175385-2]
    (-> this (.getClickedComponentAt p-175385-1 p-175385-2))))

