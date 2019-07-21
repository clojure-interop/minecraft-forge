(ns net.minecraftforge.common.ISpecialArmor
  "This interface is to be implemented by ItemArmor classes. It will allow to
  modify computation of damage and health loss. Computation will be called
  before the actual armor computation, which can then be cancelled."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ISpecialArmor]))

(defn get-properties
  "Retrieves the modifiers to be used when calculating armor damage.

   Armor will higher priority will have damage applied to them before
   lower priority ones. If there are multiple pieces of armor with the
   same priority, damage will be distributed between them based on there
   absorption ratio.

  player - The entity wearing the armor. - `net.minecraft.entity.EntityLivingBase`
  armor - The ItemStack of the armor item itself. - `net.minecraft.item.ItemStack`
  source - The source of the damage, which can be used to alter armor properties based on the type or source of damage. - `net.minecraft.util.DamageSource`
  damage - The total damage being applied to the entity - `double`
  slot - The armor slot the item is in. - `int`

  returns: A ArmorProperties instance holding information about how the armor effects damage. - `net.minecraftforge.common.ISpecialArmor$ArmorProperties`"
  (^net.minecraftforge.common.ISpecialArmor$ArmorProperties [^ISpecialArmor this ^net.minecraft.entity.EntityLivingBase player ^net.minecraft.item.ItemStack armor ^net.minecraft.util.DamageSource source ^Double damage ^Integer slot]
    (-> this (.getProperties player armor source damage slot))))

(defn get-armor-display
  "Get the displayed effective armor.

  player - The player wearing the armor. - `net.minecraft.entity.player.EntityPlayer`
  armor - The ItemStack of the armor item itself. - `net.minecraft.item.ItemStack`
  slot - The armor slot the item is in. - `int`

  returns: The number of armor points for display, 2 per shield. - `int`"
  (^Integer [^ISpecialArmor this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack armor ^Integer slot]
    (-> this (.getArmorDisplay player armor slot))))

(defn damage-armor
  "Applies damage to the ItemStack. The mod is responsible for reducing the
   item durability and stack size. If the stack is depleted it will be cleaned
   up automatically.

  entity - The entity wearing the armor - `net.minecraft.entity.EntityLivingBase`
  stack - The ItemStack of the armor item itself. - `net.minecraft.item.ItemStack`
  source - The source of the damage, which can be used to alter armor properties based on the type or source of damage. - `net.minecraft.util.DamageSource`
  damage - The amount of damage being applied to the armor - `int`
  slot - The armor slot the item is in. - `int`"
  ([^ISpecialArmor this ^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack stack ^net.minecraft.util.DamageSource source ^Integer damage ^Integer slot]
    (-> this (.damageArmor entity stack source damage slot))))

