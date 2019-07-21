(ns net.minecraft.entity.passive.EntityVillager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.passive EntityVillager]))

(defn ->entity-villager
  "Constructor.

  world-in - `net.minecraft.world.World`
  profession-id - `int`"
  (^EntityVillager [^net.minecraft.world.World world-in ^Integer profession-id]
    (new EntityVillager world-in profession-id))
  (^EntityVillager [^net.minecraft.world.World world-in]
    (new EntityVillager world-in)))

(defn *register-fixes-villager
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityVillager/registerFixesVillager fixer)))

(defn *get-trades-dont-use
  "returns: `net.minecraft.entity.passive.EntityVillager$ITradeList[][][][]`"
  ([]
    (EntityVillager/GET_TRADES_DONT_USE )))

(defn get-eye-height
  "returns: `float`"
  (^Float [^EntityVillager this]
    (-> this (.getEyeHeight))))

(defn can-be-leashed-to?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^EntityVillager this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canBeLeashedTo player))))

(defn farm-item-in-inventory?
  "returns: `boolean`"
  (^Boolean [^EntityVillager this]
    (-> this (.isFarmItemInInventory))))

(defn process-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityVillager this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInteract player hand))))

(defn set-mating
  "mating - `boolean`"
  ([^EntityVillager this ^Boolean mating]
    (-> this (.setMating mating))))

(defn get-profession-forge
  "returns: `net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession`"
  (^net.minecraftforge.fml.common.registry.VillagerRegistry$VillagerProfession [^EntityVillager this]
    (-> this (.getProfessionForge))))

(defn verify-selling-item
  "stack - `net.minecraft.item.ItemStack`"
  ([^EntityVillager this ^net.minecraft.item.ItemStack stack]
    (-> this (.verifySellingItem stack))))

(defn finalize-mob-spawn
  "p-190672-1 - `net.minecraft.world.DifficultyInstance`
  p-190672-2 - `net.minecraft.entity.IEntityLivingData`
  p-190672-3 - `boolean`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityVillager this ^net.minecraft.world.DifficultyInstance p-190672-1 ^net.minecraft.entity.IEntityLivingData p-190672-2 ^Boolean p-190672-3]
    (-> this (.finalizeMobSpawn p-190672-1 p-190672-2 p-190672-3))))

(defn get-is-willing-to-mate?
  "update-first - `boolean`

  returns: `boolean`"
  (^Boolean [^EntityVillager this ^Boolean update-first]
    (-> this (.getIsWillingToMate update-first))))

(defn trading?
  "returns: `boolean`"
  (^Boolean [^EntityVillager this]
    (-> this (.isTrading))))

(defn create-child
  "ageable - `net.minecraft.entity.EntityAgeable`

  returns: `net.minecraft.entity.passive.EntityVillager`"
  (^net.minecraft.entity.passive.EntityVillager [^EntityVillager this ^net.minecraft.entity.EntityAgeable ageable]
    (-> this (.createChild ageable))))

(defn set-is-willing-to-mate
  "is-willing-to-mate - `boolean`"
  ([^EntityVillager this ^Boolean is-willing-to-mate]
    (-> this (.setIsWillingToMate is-willing-to-mate))))

(defn has-enough-food-to-breed?
  "returns: `boolean`"
  (^Boolean [^EntityVillager this]
    (-> this (.hasEnoughFoodToBreed))))

(defn wants-more-food
  "returns: `boolean`"
  (^Boolean [^EntityVillager this]
    (-> this (.wantsMoreFood))))

(defn set-recipes
  "recipe-list - `net.minecraft.village.MerchantRecipeList`"
  ([^EntityVillager this ^net.minecraft.village.MerchantRecipeList recipe-list]
    (-> this (.setRecipes recipe-list))))

(defn get-display-name
  "returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^EntityVillager this]
    (-> this (.getDisplayName))))

(defn get-recipes
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.village.MerchantRecipeList`"
  (^net.minecraft.village.MerchantRecipeList [^EntityVillager this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.getRecipes player))))

(defn read-entity-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityVillager this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readEntityFromNBT compound))))

(defn on-death
  "cause - `net.minecraft.util.DamageSource`"
  ([^EntityVillager this ^net.minecraft.util.DamageSource cause]
    (-> this (.onDeath cause))))

(defn can-abondon-items?
  "returns: `boolean`"
  (^Boolean [^EntityVillager this]
    (-> this (.canAbondonItems))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^EntityVillager this]
    (-> this (.getWorld))))

(defn get-customer
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^EntityVillager this]
    (-> this (.getCustomer))))

(defn write-entity-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^EntityVillager this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeEntityToNBT compound))))

(defn set-customer
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^EntityVillager this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.setCustomer player))))

(defn mating?
  "returns: `boolean`"
  (^Boolean [^EntityVillager this]
    (-> this (.isMating))))

(defn set-looking-for-home
  ""
  ([^EntityVillager this]
    (-> this (.setLookingForHome))))

(defn get-profession
  "Deprecated.

  returns: `int`"
  (^Integer [^EntityVillager this]
    (-> this (.getProfession))))

(defn playing?
  "returns: `boolean`"
  (^Boolean [^EntityVillager this]
    (-> this (.isPlaying))))

(defn set-playing
  "playing - `boolean`"
  ([^EntityVillager this ^Boolean playing]
    (-> this (.setPlaying playing))))

(defn replace-item-in-inventory
  "inventory-slot - `int`
  item-stack-in - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^EntityVillager this ^Integer inventory-slot ^net.minecraft.item.ItemStack item-stack-in]
    (-> this (.replaceItemInInventory inventory-slot item-stack-in))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EntityVillager this]
    (-> this (.getPos))))

(defn set-revenge-target
  "living-base - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityVillager this ^net.minecraft.entity.EntityLivingBase living-base]
    (-> this (.setRevengeTarget living-base))))

(defn on-struck-by-lightning
  "lightning-bolt - `net.minecraft.entity.effect.EntityLightningBolt`"
  ([^EntityVillager this ^net.minecraft.entity.effect.EntityLightningBolt lightning-bolt]
    (-> this (.onStruckByLightning lightning-bolt))))

(defn on-initial-spawn
  "difficulty - `net.minecraft.world.DifficultyInstance`
  livingdata - `net.minecraft.entity.IEntityLivingData`

  returns: `net.minecraft.entity.IEntityLivingData`"
  (^net.minecraft.entity.IEntityLivingData [^EntityVillager this ^net.minecraft.world.DifficultyInstance difficulty ^net.minecraft.entity.IEntityLivingData livingdata]
    (-> this (.onInitialSpawn difficulty livingdata))))

(defn use-recipe
  "recipe - `net.minecraft.village.MerchantRecipe`"
  ([^EntityVillager this ^net.minecraft.village.MerchantRecipe recipe]
    (-> this (.useRecipe recipe))))

(defn set-profession
  "profession-id - `int`"
  ([^EntityVillager this ^Integer profession-id]
    (-> this (.setProfession profession-id))))

(defn get-villager-inventory
  "returns: `net.minecraft.inventory.InventoryBasic`"
  (^net.minecraft.inventory.InventoryBasic [^EntityVillager this]
    (-> this (.getVillagerInventory))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityVillager this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn handle-status-update
  "id - `byte`"
  ([^EntityVillager this ^Byte id]
    (-> this (.handleStatusUpdate id))))

