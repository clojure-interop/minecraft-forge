(ns net.minecraft.client.gui.GuiMerchant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiMerchant]))

(defn ->gui-merchant
  "Constructor.

  p-i-45500-1 - `net.minecraft.entity.player.InventoryPlayer`
  p-i-45500-2 - `net.minecraft.entity.IMerchant`
  world-in - `net.minecraft.world.World`"
  (^GuiMerchant [^net.minecraft.entity.player.InventoryPlayer p-i-45500-1 ^net.minecraft.entity.IMerchant p-i-45500-2 ^net.minecraft.world.World world-in]
    (new GuiMerchant p-i-45500-1 p-i-45500-2 world-in)))

(defn init-gui
  ""
  ([^GuiMerchant this]
    (-> this (.initGui))))

(defn update-screen
  ""
  ([^GuiMerchant this]
    (-> this (.updateScreen))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiMerchant this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn get-merchant
  "returns: `net.minecraft.entity.IMerchant`"
  (^net.minecraft.entity.IMerchant [^GuiMerchant this]
    (-> this (.getMerchant))))

