(ns net.minecraft.client.gui.GuiRepair
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiRepair]))

(defn ->gui-repair
  "Constructor.

  inventory-in - `net.minecraft.entity.player.InventoryPlayer`
  world-in - `net.minecraft.world.World`"
  (^GuiRepair [^net.minecraft.entity.player.InventoryPlayer inventory-in ^net.minecraft.world.World world-in]
    (new GuiRepair inventory-in world-in)))

(defn init-gui
  ""
  ([^GuiRepair this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiRepair this]
    (-> this (.onGuiClosed))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiRepair this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn update-crafting-inventory
  "container-to-send - `net.minecraft.inventory.Container`
  items-list - `net.minecraft.util.NonNullList`"
  ([^GuiRepair this ^net.minecraft.inventory.Container container-to-send ^net.minecraft.util.NonNullList items-list]
    (-> this (.updateCraftingInventory container-to-send items-list))))

(defn send-slot-contents
  "container-to-send - `net.minecraft.inventory.Container`
  slot-ind - `int`
  stack - `net.minecraft.item.ItemStack`"
  ([^GuiRepair this ^net.minecraft.inventory.Container container-to-send ^Integer slot-ind ^net.minecraft.item.ItemStack stack]
    (-> this (.sendSlotContents container-to-send slot-ind stack))))

(defn send-progress-bar-update
  "container-in - `net.minecraft.inventory.Container`
  var-to-update - `int`
  new-value - `int`"
  ([^GuiRepair this ^net.minecraft.inventory.Container container-in ^Integer var-to-update ^Integer new-value]
    (-> this (.sendProgressBarUpdate container-in var-to-update new-value))))

(defn send-all-window-properties
  "container-in - `net.minecraft.inventory.Container`
  inventory - `net.minecraft.inventory.IInventory`"
  ([^GuiRepair this ^net.minecraft.inventory.Container container-in ^net.minecraft.inventory.IInventory inventory]
    (-> this (.sendAllWindowProperties container-in inventory))))

