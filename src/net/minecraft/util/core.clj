(ns net.minecraft.util.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraft.util.ActionResult])
(require '[net.minecraft.util.BitArray])
(require '[net.minecraft.util.BlockRenderLayer])
(require '[net.minecraft.util.ChatAllowedCharacters])
(require '[net.minecraft.util.ClassInheritanceMultiMap])
(require '[net.minecraft.util.CombatEntry])
(require '[net.minecraft.util.CombatRules])
(require '[net.minecraft.util.CombatTracker])
(require '[net.minecraft.util.CooldownTracker])
(require '[net.minecraft.util.CooldownTrackerServer])
(require '[net.minecraft.util.CryptManager])
(require '[net.minecraft.util.DamageSource])
(require '[net.minecraft.util.EnchantmentNameParts])
(require '[net.minecraft.util.EntityDamageSource])
(require '[net.minecraft.util.EntityDamageSourceIndirect])
(require '[net.minecraft.util.EntitySelectors$ArmoredMob])
(require '[net.minecraft.util.EntitySelectors])
(require '[net.minecraft.util.EnumActionResult])
(require '[net.minecraft.util.EnumBlockRenderType])
(require '[net.minecraft.util.EnumFacing$Axis])
(require '[net.minecraft.util.EnumFacing$AxisDirection])
(require '[net.minecraft.util.EnumFacing$Plane])
(require '[net.minecraft.util.EnumFacing])
(require '[net.minecraft.util.EnumHand])
(require '[net.minecraft.util.EnumHandSide])
(require '[net.minecraft.util.EnumParticleTypes])
(require '[net.minecraft.util.EnumTypeAdapterFactory])
(require '[net.minecraft.util.FoodStats])
(require '[net.minecraft.util.FrameTimer])
(require '[net.minecraft.util.HttpUtil])
(require '[net.minecraft.util.IJsonSerializable])
(require '[net.minecraft.util.IObjectIntIterable])
(require '[net.minecraft.util.IProgressUpdate])
(require '[net.minecraft.util.IStringSerializable])
(require '[net.minecraft.util.ITabCompleter])
(require '[net.minecraft.util.IThreadListener])
(require '[net.minecraft.util.ITickable])
(require '[net.minecraft.util.IntHashMap])
(require '[net.minecraft.util.IntIdentityHashBiMap])
(require '[net.minecraft.util.IntegerCache])
(require '[net.minecraft.util.JsonSerializableSet])
(require '[net.minecraft.util.JsonUtils])
(require '[net.minecraft.util.LazyLoadBase])
(require '[net.minecraft.util.LoggingPrintStream])
(require '[net.minecraft.util.LowerStringMap])
(require '[net.minecraft.util.MapPopulator])
(require '[net.minecraft.util.MinecraftError])
(require '[net.minecraft.util.Mirror])
(require '[net.minecraft.util.MouseFilter])
(require '[net.minecraft.util.MouseHelper])
(require '[net.minecraft.util.MovementInput])
(require '[net.minecraft.util.MovementInputFromOptions])
(require '[net.minecraft.util.NonNullList])
(require '[net.minecraft.util.ObjectIntIdentityMap])
(require '[net.minecraft.util.ReportedException])
(require '[net.minecraft.util.ResourceLocation])
(require '[net.minecraft.util.Rotation])
(require '[net.minecraft.util.ScreenShotHelper])
(require '[net.minecraft.util.Session$Type])
(require '[net.minecraft.util.Session])
(require '[net.minecraft.util.SoundCategory])
(require '[net.minecraft.util.SoundEvent])
(require '[net.minecraft.util.StringUtils])
(require '[net.minecraft.util.TabCompleter])
(require '[net.minecraft.util.Timer])
(require '[net.minecraft.util.Tuple])
(require '[net.minecraft.util.TupleIntJsonSerializable])
(require '[net.minecraft.util.Util$EnumOS])
(require '[net.minecraft.util.Util])
(require '[net.minecraft.util.WeightedRandom$Item])
(require '[net.minecraft.util.WeightedRandom])
(require '[net.minecraft.util.WeightedSpawnerEntity])
