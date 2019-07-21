(ns net.minecraft.client.gui.inventory.GuiCrafting
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui.inventory GuiCrafting]))

(defn ->gui-crafting
  "Constructor.

  player-inv - `net.minecraft.entity.player.InventoryPlayer`
  world-in - `net.minecraft.world.World`
  block-position - `net.minecraft.util.math.BlockPos`"
  (^GuiCrafting [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos block-position]
    (new GuiCrafting player-inv world-in block-position))
  (^GuiCrafting [^net.minecraft.entity.player.InventoryPlayer player-inv ^net.minecraft.world.World world-in]
    (new GuiCrafting player-inv world-in)))

