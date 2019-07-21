(ns net.minecraft.inventory.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraft.inventory.ClickType])
(require '[net.minecraft.inventory.Container])
(require '[net.minecraft.inventory.ContainerBeacon])
(require '[net.minecraft.inventory.ContainerBrewingStand])
(require '[net.minecraft.inventory.ContainerChest])
(require '[net.minecraft.inventory.ContainerDispenser])
(require '[net.minecraft.inventory.ContainerEnchantment])
(require '[net.minecraft.inventory.ContainerFurnace])
(require '[net.minecraft.inventory.ContainerHopper])
(require '[net.minecraft.inventory.ContainerHorseChest])
(require '[net.minecraft.inventory.ContainerHorseInventory])
(require '[net.minecraft.inventory.ContainerMerchant])
(require '[net.minecraft.inventory.ContainerPlayer])
(require '[net.minecraft.inventory.ContainerRepair])
(require '[net.minecraft.inventory.ContainerShulkerBox])
(require '[net.minecraft.inventory.ContainerWorkbench])
(require '[net.minecraft.inventory.EntityEquipmentSlot$Type])
(require '[net.minecraft.inventory.EntityEquipmentSlot])
(require '[net.minecraft.inventory.IContainerListener])
(require '[net.minecraft.inventory.IInventory])
(require '[net.minecraft.inventory.IInventoryChangedListener])
(require '[net.minecraft.inventory.ISidedInventory])
(require '[net.minecraft.inventory.InventoryBasic])
(require '[net.minecraft.inventory.InventoryCraftResult])
(require '[net.minecraft.inventory.InventoryCrafting])
(require '[net.minecraft.inventory.InventoryEnderChest])
(require '[net.minecraft.inventory.InventoryHelper])
(require '[net.minecraft.inventory.InventoryLargeChest])
(require '[net.minecraft.inventory.InventoryMerchant])
(require '[net.minecraft.inventory.ItemStackHelper])
(require '[net.minecraft.inventory.Slot])
(require '[net.minecraft.inventory.SlotCrafting])
(require '[net.minecraft.inventory.SlotFurnaceFuel])
(require '[net.minecraft.inventory.SlotFurnaceOutput])
(require '[net.minecraft.inventory.SlotMerchantResult])
(require '[net.minecraft.inventory.SlotShulkerBox])
