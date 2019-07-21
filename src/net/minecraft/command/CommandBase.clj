(ns net.minecraft.command.CommandBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.command CommandBase]))

(defn ->command-base
  "Constructor."
  (^CommandBase []
    (new CommandBase )))

(defn *notify-command-listener
  "sender - `net.minecraft.command.ICommandSender`
  command - `net.minecraft.command.ICommand`
  flags - `int`
  translation-key - `java.lang.String`
  translation-args - `java.lang.Object`"
  ([^net.minecraft.command.ICommandSender sender ^net.minecraft.command.ICommand command ^Integer flags ^java.lang.String translation-key ^java.lang.Object translation-args]
    (CommandBase/notifyCommandListener sender command flags translation-key translation-args))
  ([^net.minecraft.command.ICommandSender sender ^net.minecraft.command.ICommand command ^java.lang.String translation-key ^java.lang.Object translation-args]
    (CommandBase/notifyCommandListener sender command translation-key translation-args)))

(defn *does-string-start-with
  "original - `java.lang.String`
  region - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String original ^java.lang.String region]
    (CommandBase/doesStringStartWith original region)))

(defn *get-tab-completion-coordinate-xz
  "input-args - `java.lang.String[]`
  index - `int`
  looked-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [input-args ^Integer index ^net.minecraft.util.math.BlockPos looked-pos]
    (CommandBase/getTabCompletionCoordinateXZ input-args index looked-pos)))

(defn *join-nice-string-from-collection
  "strings - `java.util.Collection`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Collection strings]
    (CommandBase/joinNiceStringFromCollection strings)))

(defn *get-block-by-text
  "sender - `net.minecraft.command.ICommandSender`
  id - `java.lang.String`

  returns: `net.minecraft.block.Block`

  throws: net.minecraft.command.NumberInvalidException"
  (^net.minecraft.block.Block [^net.minecraft.command.ICommandSender sender ^java.lang.String id]
    (CommandBase/getBlockByText sender id)))

(defn *get-list-of-strings-matching-last-word
  "args - `java.lang.String[]`
  possibilities - `java.lang.String`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [args ^java.lang.String possibilities]
    (CommandBase/getListOfStringsMatchingLastWord args possibilities)))

(defn *parse-block-pos
  "sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  start-index - `int`
  center-block - `boolean`

  returns: `net.minecraft.util.math.BlockPos`

  throws: net.minecraft.command.NumberInvalidException"
  (^net.minecraft.util.math.BlockPos [^net.minecraft.command.ICommandSender sender args ^Integer start-index ^Boolean center-block]
    (CommandBase/parseBlockPos sender args start-index center-block)))

(defn *get-entity
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  target - `java.lang.String`
  target-class - `java.lang.Class`

  returns: `<T extends net.minecraft.entity.Entity> T`

  throws: net.minecraft.command.EntityNotFoundException"
  ([^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender ^java.lang.String target ^java.lang.Class target-class]
    (CommandBase/getEntity server sender target target-class))
  (^net.minecraft.entity.Entity [^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender ^java.lang.String target]
    (CommandBase/getEntity server sender target)))

(defn *get-tab-completion-coordinate
  "input-args - `java.lang.String[]`
  index - `int`
  pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [input-args ^Integer index ^net.minecraft.util.math.BlockPos pos]
    (CommandBase/getTabCompletionCoordinate input-args index pos)))

(defn *join-nice-string
  "elements - `java.lang.Object[]`

  returns: `java.lang.String`"
  (^java.lang.String [elements]
    (CommandBase/joinNiceString elements)))

(defn *get-player-name
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  target - `java.lang.String`

  returns: `java.lang.String`

  throws: net.minecraft.command.PlayerNotFoundException"
  (^java.lang.String [^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender ^java.lang.String target]
    (CommandBase/getPlayerName server sender target)))

(defn *convert-arg-to-block-state-predicate
  "p-190791-0 - `net.minecraft.block.Block`
  p-190791-1 - `java.lang.String`

  returns: `com.google.common.base.Predicate<net.minecraft.block.state.IBlockState>`

  throws: net.minecraft.command.InvalidBlockStateException"
  (^com.google.common.base.Predicate [^net.minecraft.block.Block p-190791-0 ^java.lang.String p-190791-1]
    (CommandBase/convertArgToBlockStatePredicate p-190791-0 p-190791-1)))

(defn *get-entity-list
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  target - `java.lang.String`

  returns: `java.util.List<net.minecraft.entity.Entity>`

  throws: net.minecraft.command.EntityNotFoundException"
  (^java.util.List [^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender ^java.lang.String target]
    (CommandBase/getEntityList server sender target)))

(defn *get-player
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  target - `java.lang.String`

  returns: `net.minecraft.entity.player.EntityPlayerMP`

  throws: net.minecraft.command.PlayerNotFoundException"
  (^net.minecraft.entity.player.EntityPlayerMP [^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender ^java.lang.String target]
    (CommandBase/getPlayer server sender target)))

(defn *get-chat-component-from-nth-arg
  "sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  index - `int`
  p-147176-3 - `boolean`

  returns: `net.minecraft.util.text.ITextComponent`

  throws: net.minecraft.command.PlayerNotFoundException"
  (^net.minecraft.util.text.ITextComponent [^net.minecraft.command.ICommandSender sender args ^Integer index ^Boolean p-147176-3]
    (CommandBase/getChatComponentFromNthArg sender args index p-147176-3))
  (^net.minecraft.util.text.ITextComponent [^net.minecraft.command.ICommandSender sender args ^Integer index]
    (CommandBase/getChatComponentFromNthArg sender args index)))

(defn *parse-boolean
  "input - `java.lang.String`

  returns: `boolean`

  throws: net.minecraft.command.CommandException"
  (^Boolean [^java.lang.String input]
    (CommandBase/parseBoolean input)))

(defn *parse-double
  "base - `double`
  input - `java.lang.String`
  min - `int`
  max - `int`
  center-block - `boolean`

  returns: `double`

  throws: net.minecraft.command.NumberInvalidException"
  (^Double [^Double base ^java.lang.String input ^Integer min ^Integer max ^Boolean center-block]
    (CommandBase/parseDouble base input min max center-block))
  (^Double [^java.lang.String input ^Double min ^Double max]
    (CommandBase/parseDouble input min max))
  (^Double [^java.lang.String input ^Double min]
    (CommandBase/parseDouble input min))
  (^Double [^java.lang.String input]
    (CommandBase/parseDouble input)))

(defn *parse-long
  "input - `java.lang.String`
  min - `long`
  max - `long`

  returns: `long`

  throws: net.minecraft.command.NumberInvalidException"
  (^Long [^java.lang.String input ^Long min ^Long max]
    (CommandBase/parseLong input min max))
  (^Long [^java.lang.String input]
    (CommandBase/parseLong input)))

(defn *get-command-sender-as-player
  "sender - `net.minecraft.command.ICommandSender`

  returns: `net.minecraft.entity.player.EntityPlayerMP`

  throws: net.minecraft.command.PlayerNotFoundException"
  (^net.minecraft.entity.player.EntityPlayerMP [^net.minecraft.command.ICommandSender sender]
    (CommandBase/getCommandSenderAsPlayer sender)))

(defn *join
  "components - `java.util.List`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^java.util.List components]
    (CommandBase/join components)))

(defn *build-string
  "args - `java.lang.String[]`
  start-pos - `int`

  returns: `java.lang.String`"
  (^java.lang.String [args ^Integer start-pos]
    (CommandBase/buildString args start-pos)))

(defn *parse-coordinate
  "base - `double`
  selector-arg - `java.lang.String`
  min - `int`
  max - `int`
  center-block - `boolean`

  returns: `net.minecraft.command.CommandBase$CoordinateArg`

  throws: net.minecraft.command.NumberInvalidException"
  (^net.minecraft.command.CommandBase$CoordinateArg [^Double base ^java.lang.String selector-arg ^Integer min ^Integer max ^Boolean center-block]
    (CommandBase/parseCoordinate base selector-arg min max center-block))
  (^net.minecraft.command.CommandBase$CoordinateArg [^Double base ^java.lang.String selector-arg ^Boolean center-block]
    (CommandBase/parseCoordinate base selector-arg center-block)))

(defn *set-command-listener
  "listener - `net.minecraft.command.ICommandListener`"
  ([^net.minecraft.command.ICommandListener listener]
    (CommandBase/setCommandListener listener)))

(defn *convert-arg-to-block-state
  "p-190794-0 - `net.minecraft.block.Block`
  p-190794-1 - `java.lang.String`

  returns: `net.minecraft.block.state.IBlockState`

  throws: net.minecraft.command.NumberInvalidException"
  (^net.minecraft.block.state.IBlockState [^net.minecraft.block.Block p-190794-0 ^java.lang.String p-190794-1]
    (CommandBase/convertArgToBlockState p-190794-0 p-190794-1)))

(defn *get-item-by-text
  "sender - `net.minecraft.command.ICommandSender`
  id - `java.lang.String`

  returns: `net.minecraft.item.Item`

  throws: net.minecraft.command.NumberInvalidException"
  (^net.minecraft.item.Item [^net.minecraft.command.ICommandSender sender ^java.lang.String id]
    (CommandBase/getItemByText sender id)))

(defn *get-entity-name
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  target - `java.lang.String`

  returns: `java.lang.String`

  throws: net.minecraft.command.EntityNotFoundException"
  (^java.lang.String [^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender ^java.lang.String target]
    (CommandBase/getEntityName server sender target)))

(defn *parse-int
  "input - `java.lang.String`
  min - `int`
  max - `int`

  returns: `int`

  throws: net.minecraft.command.NumberInvalidException"
  (^Integer [^java.lang.String input ^Integer min ^Integer max]
    (CommandBase/parseInt input min max))
  (^Integer [^java.lang.String input ^Integer min]
    (CommandBase/parseInt input min))
  (^Integer [^java.lang.String input]
    (CommandBase/parseInt input)))

(defn get-required-permission-level
  "returns: `int`"
  (^Integer [^CommandBase this]
    (-> this (.getRequiredPermissionLevel))))

(defn get-aliases
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandBase this]
    (-> this (.getAliases))))

(defn check-permission
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`

  returns: `boolean`"
  (^Boolean [^CommandBase this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender]
    (-> this (.checkPermission server sender))))

(defn get-tab-completions
  "server - `net.minecraft.server.MinecraftServer`
  sender - `net.minecraft.command.ICommandSender`
  args - `java.lang.String[]`
  target-pos - `net.minecraft.util.math.BlockPos`

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CommandBase this ^net.minecraft.server.MinecraftServer server ^net.minecraft.command.ICommandSender sender args ^net.minecraft.util.math.BlockPos target-pos]
    (-> this (.getTabCompletions server sender args target-pos))))

(defn username-index?
  "args - `java.lang.String[]`
  index - `int`

  returns: `boolean`"
  (^Boolean [^CommandBase this args ^Integer index]
    (-> this (.isUsernameIndex args index))))

(defn compare-to
  "p-compare-to-1 - `net.minecraft.command.ICommand`

  returns: `int`"
  (^Integer [^CommandBase this ^net.minecraft.command.ICommand p-compare-to-1]
    (-> this (.compareTo p-compare-to-1))))

