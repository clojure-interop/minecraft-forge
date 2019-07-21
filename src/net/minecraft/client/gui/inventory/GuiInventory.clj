(ns net.minecraft.client.gui.inventory.GuiInventory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiInventory]))

(defn ->gui-inventory
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^GuiInventory [^net.minecraft.entity.player.EntityPlayer player]
    (new GuiInventory player)))

(defn *draw-entity-on-screen
  "pos-x - `int`
  pos-y - `int`
  scale - `int`
  mouse-x - `float`
  mouse-y - `float`
  ent - `net.minecraft.entity.EntityLivingBase`"
  ([^Integer pos-x ^Integer pos-y ^Integer scale ^Float mouse-x ^Float mouse-y ^net.minecraft.entity.EntityLivingBase ent]
    (GuiInventory/drawEntityOnScreen pos-x pos-y scale mouse-x mouse-y ent)))

(defn update-screen
  ""
  ([^GuiInventory this]
    (-> this (.updateScreen))))

(defn init-gui
  ""
  ([^GuiInventory this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiInventory this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

