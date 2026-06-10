// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class AOSModGrundstokGunhauler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "aosmodgrundstokgunhauler"), "main");
	private final ModelPart body;

	public AOSModGrundstokGunhauler(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-14.0F, -2.0F, -8.0F, 28.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bodyFront = body.addOrReplaceChild("bodyFront", CubeListBuilder.create().texOffs(0, 20).addBox(-16.0F, -2.0F, -16.0F, 32.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -16.0F));

		PartDefinition bottomFrontRight = bodyFront.addOrReplaceChild("bottomFrontRight", CubeListBuilder.create().texOffs(100, -24).addBox(0.0F, -1.0F, -15.5F, 0.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, 1.0F, -0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bottomFrontRight2 = bottomFrontRight.addOrReplaceChild("bottomFrontRight2", CubeListBuilder.create().texOffs(100, -20).addBox(0.0F, -1.0F, -15.0F, 0.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2588F, 2.9659F, -0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bottomFrontRight3 = bottomFrontRight2.addOrReplaceChild("bottomFrontRight3", CubeListBuilder.create().texOffs(100, -15).addBox(0.0F, 0.0F, -15.0F, 0.0F, 13.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition bottomFrontLeft = bodyFront.addOrReplaceChild("bottomFrontLeft", CubeListBuilder.create().texOffs(100, -24).addBox(0.0F, -1.0F, -8.5F, 0.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 1.0F, -0.5F, 3.1416F, 0.0F, -2.8798F));

		PartDefinition bottomFrontLeft2 = bottomFrontLeft.addOrReplaceChild("bottomFrontLeft2", CubeListBuilder.create().texOffs(100, -20).addBox(0.0F, -1.0F, -8.0F, 0.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2588F, 2.9659F, -0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bottomFrontLeft3 = bottomFrontLeft2.addOrReplaceChild("bottomFrontLeft3", CubeListBuilder.create().texOffs(100, -15).addBox(0.0F, 0.0F, -8.0F, 0.0F, 13.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition Middle = bodyFront.addOrReplaceChild("Middle", CubeListBuilder.create().texOffs(155, 16).addBox(-16.0F, -2.0F, 1.0F, 32.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 7.0F));

		PartDefinition noseLeft = bodyFront.addOrReplaceChild("noseLeft", CubeListBuilder.create().texOffs(208, 163).addBox(-11.0F, -1.0F, -1.0F, 21.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, -1.0F, -22.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bottomFrontLeftNose = noseLeft.addOrReplaceChild("bottomFrontLeftNose", CubeListBuilder.create().texOffs(136, 12).addBox(0.0F, 0.5F, -11.0F, 0.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9289F, 0.5F, -0.9289F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition bottomFrontLeftNose2 = bottomFrontLeftNose.addOrReplaceChild("bottomFrontLeftNose2", CubeListBuilder.create().texOffs(135, 20).addBox(0.0F, 0.45F, -11.0F, 0.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bottomFrontLeftNose3 = bottomFrontLeftNose2.addOrReplaceChild("bottomFrontLeftNose3", CubeListBuilder.create().texOffs(134, 28).addBox(0.0F, 0.1F, -11.0F, 0.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.6109F));

		PartDefinition noseRight = bodyFront.addOrReplaceChild("noseRight", CubeListBuilder.create().texOffs(208, 174).addBox(-11.0F, -1.0F, -1.0F, 22.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -1.0F, -23.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition bottomFrontRightNose = noseRight.addOrReplaceChild("bottomFrontRightNose", CubeListBuilder.create().texOffs(136, 12).addBox(0.0F, 0.5F, -10.0F, 0.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9289F, 0.5F, -0.9289F, 1.5708F, 1.309F, 1.5708F));

		PartDefinition bottomFrontRightNose2 = bottomFrontRightNose.addOrReplaceChild("bottomFrontRightNose2", CubeListBuilder.create().texOffs(135, 20).addBox(0.0F, 0.5F, -10.0F, 0.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bottomFrontRightNose3 = bottomFrontRightNose2.addOrReplaceChild("bottomFrontRightNose3", CubeListBuilder.create().texOffs(134, 28).addBox(0.0F, 0.1F, -8.0F, 0.0F, 10.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition noseMiddle = bodyFront.addOrReplaceChild("noseMiddle", CubeListBuilder.create().texOffs(1, 211).addBox(-1.5F, -2.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 2.0F, -30.0F));

		PartDefinition noseLeftPlat = noseMiddle.addOrReplaceChild("noseLeftPlat", CubeListBuilder.create().texOffs(-12, 195).addBox(-1.0F, -2.0F, -11.0F, 13.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 13.0F));

		PartDefinition noseMiddle2 = noseMiddle.addOrReplaceChild("noseMiddle2", CubeListBuilder.create().texOffs(0, 228).addBox(-1.49F, 0.0F, -1.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition noseMiddle3 = noseMiddle2.addOrReplaceChild("noseMiddle3", CubeListBuilder.create().texOffs(0, 238).addBox(-1.49F, 0.0F, -1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition noseMiddle4 = noseMiddle3.addOrReplaceChild("noseMiddle4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 13.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition noseMiddle4_r1 = noseMiddle4.addOrReplaceChild("noseMiddle4_r1", CubeListBuilder.create().texOffs(13, 210).addBox(-1.5F, -2.0F, -2.0F, 1.0F, 25.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition noseMiddle7 = noseMiddle4.addOrReplaceChild("noseMiddle7", CubeListBuilder.create(), PartPose.offset(0.0F, 16.2313F, -1.2433F));

		PartDefinition noseMiddle7_r1 = noseMiddle7.addOrReplaceChild("noseMiddle7_r1", CubeListBuilder.create().texOffs(20, 210).addBox(-1.5F, 7.0F, -2.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition noseMiddle5 = noseMiddle.addOrReplaceChild("noseMiddle5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, -5.246F, 2.8335F, -0.7854F, 0.0F, 0.0F));

		PartDefinition noseMiddle5_r1 = noseMiddle5.addOrReplaceChild("noseMiddle5_r1", CubeListBuilder.create().texOffs(29, 212).addBox(-1.5F, -2.0F, -2.0F, 1.0F, 17.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.754F, 4.1665F, -0.2618F, 0.0F, 0.0F));

		PartDefinition noseMiddle6 = noseMiddle5.addOrReplaceChild("noseMiddle6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition noseMiddle6_r1 = noseMiddle6.addOrReplaceChild("noseMiddle6_r1", CubeListBuilder.create().texOffs(48, 207).addBox(-1.49F, -41.0F, -8.5F, 1.0F, 41.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -9.754F, 4.1665F, -0.2618F, 0.0F, 0.0F));

		PartDefinition noseRightPlat = noseMiddle.addOrReplaceChild("noseRightPlat", CubeListBuilder.create().texOffs(16, 193).addBox(-15.5F, 0.0F, -7.0F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -7.0F, 8.0F, 0.49F, 0.1925F, -0.3444F));

		PartDefinition bodyRight = bodyFront.addOrReplaceChild("bodyRight", CubeListBuilder.create().texOffs(180, 118).addBox(-14.0F, -6.0F, -16.0F, 14.0F, 6.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition bodyLeft = bodyFront.addOrReplaceChild("bodyLeft", CubeListBuilder.create().texOffs(204, 49).addBox(-14.0F, -6.0F, -11.0F, 13.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, -2.0F, 0.0F));

		PartDefinition skyCannon = bodyLeft.addOrReplaceChild("skyCannon", CubeListBuilder.create().texOffs(228, 71).addBox(-1.0F, -5.0F, -13.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, 0.0F, -8.0F));

		PartDefinition skyCannon2 = skyCannon.addOrReplaceChild("skyCannon2", CubeListBuilder.create().texOffs(242, 88).addBox(-0.5F, -6.5F, -13.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 1.0F, -1.0F));

		PartDefinition gunnerWheel = bodyLeft.addOrReplaceChild("gunnerWheel", CubeListBuilder.create().texOffs(244, 99).addBox(-1.0F, -3.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -2.0F, 3.0F));

		PartDefinition gunnerWheel2 = gunnerWheel.addOrReplaceChild("gunnerWheel2", CubeListBuilder.create().texOffs(244, 133).addBox(0.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition gunnerWheel3 = gunnerWheel2.addOrReplaceChild("gunnerWheel3", CubeListBuilder.create().texOffs(245, 134).addBox(-3.5F, -1.5F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 2.0F));

		PartDefinition wingLeft = bodyFront.addOrReplaceChild("wingLeft", CubeListBuilder.create().texOffs(-10, 52).addBox(-2.0F, 0.0F, -5.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(18.0F, -1.0F, 1.0F));

		PartDefinition wingLeft2 = wingLeft.addOrReplaceChild("wingLeft2", CubeListBuilder.create().texOffs(0, 67).addBox(-2.0F, -0.5F, -5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingLeft3 = wingLeft2.addOrReplaceChild("wingLeft3", CubeListBuilder.create().texOffs(0, 74).addBox(-5.5F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition wingLeftSmall = wingLeft.addOrReplaceChild("wingLeftSmall", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition wingLeftSmall2 = wingLeft.addOrReplaceChild("wingLeftSmall2", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 6.0F));

		PartDefinition wingLeftSmall3 = wingLeft.addOrReplaceChild("wingLeftSmall3", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 6.0F));

		PartDefinition wingRight = bodyFront.addOrReplaceChild("wingRight", CubeListBuilder.create().texOffs(-10, 52).addBox(-2.0F, 0.0F, -5.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.0F, -1.0F, 1.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition wingRight2 = wingRight.addOrReplaceChild("wingRight2", CubeListBuilder.create().texOffs(0, 67).addBox(-2.0F, -0.5F, -5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingRight3 = wingRight2.addOrReplaceChild("wingRight3", CubeListBuilder.create().texOffs(0, 74).addBox(-5.5F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition wingRightSmall = wingRight.addOrReplaceChild("wingRightSmall", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition wingRightSmall2 = wingRight.addOrReplaceChild("wingRightSmall2", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 6.0F));

		PartDefinition wingRightSmall3 = wingRight.addOrReplaceChild("wingRightSmall3", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 6.0F));

		PartDefinition wingBottom = bodyFront.addOrReplaceChild("wingBottom", CubeListBuilder.create().texOffs(-10, 52).addBox(-2.0F, 0.0F, -5.0F, 12.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.0F, 1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition wingBottom2 = wingBottom.addOrReplaceChild("wingBottom2", CubeListBuilder.create().texOffs(0, 67).addBox(-2.0F, -0.5F, -5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingBottom3 = wingBottom2.addOrReplaceChild("wingBottom3", CubeListBuilder.create().texOffs(0, 74).addBox(-5.5F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition wingBottomSmall = wingBottom.addOrReplaceChild("wingBottomSmall", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition wingBottomSmall2 = wingBottom.addOrReplaceChild("wingBottomSmall2", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 6.0F));

		PartDefinition wingBottomSmall3 = wingBottom.addOrReplaceChild("wingBottomSmall3", CubeListBuilder.create().texOffs(0, 77).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 6.0F));

		PartDefinition bottom_right = body.addOrReplaceChild("bottom_right", CubeListBuilder.create().texOffs(224, -16).addBox(0.5176F, -2.9319F, -8.5F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 1.0F, 0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bottom_right2 = bottom_right.addOrReplaceChild("bottom_right2", CubeListBuilder.create().texOffs(224, -12).addBox(1.0F, -2.7321F, -8.0F, 0.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2588F, 2.9659F, -0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bottom_right3 = bottom_right2.addOrReplaceChild("bottom_right3", CubeListBuilder.create().texOffs(224, -7).addBox(1.8794F, -0.684F, -8.0F, 0.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition bottom_left = body.addOrReplaceChild("bottom_left", CubeListBuilder.create().texOffs(224, -16).addBox(0.5176F, -2.9319F, -8.5F, 0.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, 1.0F, -0.5F, 3.1416F, 0.0F, -2.8798F));

		PartDefinition bottom_left2 = bottom_left.addOrReplaceChild("bottom_left2", CubeListBuilder.create().texOffs(224, -12).addBox(1.0F, -2.7321F, -8.0F, 0.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2588F, 2.9659F, -0.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition bottom_left3 = bottom_left2.addOrReplaceChild("bottom_left3", CubeListBuilder.create().texOffs(224, -7).addBox(1.8794F, -0.684F, -8.0F, 0.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

		PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(158, 0).addBox(-14.0F, -2.0F, 1.0F, 28.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 2.0F, 7.0F));

		PartDefinition pilotCabine = body.addOrReplaceChild("pilotCabine", CubeListBuilder.create().texOffs(159, 218).addBox(1.0F, -4.0F, -1.0F, 1.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(-14.0F, -4.0F, -7.0F));

		PartDefinition pilotCabine2 = pilotCabine.addOrReplaceChild("pilotCabine2", CubeListBuilder.create().texOffs(164, 248).addBox(1.0F, -4.0F, 11.0F, 13.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition athershotCarbine = pilotCabine.addOrReplaceChild("athershotCarbine", CubeListBuilder.create().texOffs(198, 245).addBox(3.0F, -4.0F, 8.0F, 9.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, -14.0F));

		PartDefinition athershotCarbine2 = athershotCarbine.addOrReplaceChild("athershotCarbine2", CubeListBuilder.create().texOffs(226, 242).addBox(5.0F, -3.0F, 11.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -5.0F));

		PartDefinition athershotCarbine3 = athershotCarbine2.addOrReplaceChild("athershotCarbine3", CubeListBuilder.create().texOffs(236, 245).addBox(5.5F, -2.0F, 5.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition steeringWheel = athershotCarbine.addOrReplaceChild("steeringWheel", CubeListBuilder.create().texOffs(238, 220).addBox(-3.0F, -5.0F, -1.0F, 9.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, 0.0F, 15.0F));

		PartDefinition pilotCabine3 = pilotCabine.addOrReplaceChild("pilotCabine3", CubeListBuilder.create().texOffs(130, 247).addBox(1.0F, -2.0F, 11.0F, 13.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(13.0F, 0.0F, 2.0F));

		PartDefinition pilotCabine4 = pilotCabine3.addOrReplaceChild("pilotCabine4", CubeListBuilder.create().texOffs(212, 190).addBox(12.0F, -1.0F, -9.0F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingBack = body.addOrReplaceChild("wingBack", CubeListBuilder.create().texOffs(46, 57).addBox(-3.0F, -6.0F, 8.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingBack2 = wingBack.addOrReplaceChild("wingBack2", CubeListBuilder.create().texOffs(43, 58).addBox(0.0F, -18.0F, 4.0F, 0.0F, 24.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 5.0F));

		PartDefinition wingBackSmall = wingBack2.addOrReplaceChild("wingBackSmall", CubeListBuilder.create().texOffs(67, 74).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, 17.0F));

		PartDefinition wingBackSmall2 = wingBack2.addOrReplaceChild("wingBackSmall2", CubeListBuilder.create().texOffs(67, 74).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 16.0F));

		PartDefinition wingBackSmall3 = wingBack2.addOrReplaceChild("wingBackSmall3", CubeListBuilder.create().texOffs(67, 74).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 15.0F));

		PartDefinition wingBackSmall4 = wingBack2.addOrReplaceChild("wingBackSmall4", CubeListBuilder.create().texOffs(67, 74).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 14.0F));

		PartDefinition wingBackSmall5 = wingBack.addOrReplaceChild("wingBackSmall5", CubeListBuilder.create().texOffs(67, 74).addBox(-2.0F, 1.5F, -2.0F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.0F, 22.0F));

		PartDefinition endrin = body.addOrReplaceChild("endrin", CubeListBuilder.create().texOffs(0, 107).addBox(-10.5F, -30.0F, -27.0F, 28.0F, 28.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -30.0F, 7.0F));

		PartDefinition braceLeft = endrin.addOrReplaceChild("braceLeft", CubeListBuilder.create().texOffs(88, 74).addBox(-0.95F, -2.0F, -7.0F, 0.0F, 28.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offset(17.0F, 0.0F, -20.0F));

		PartDefinition braceRight = endrin.addOrReplaceChild("braceRight", CubeListBuilder.create().texOffs(88, 74).addBox(-1.05F, -2.0F, -7.0F, 0.0F, 28.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, -20.0F));

		PartDefinition braceMiddle = endrin.addOrReplaceChild("braceMiddle", CubeListBuilder.create().texOffs(60, 67).addBox(-12.5F, 0.0F, -11.5F, 25.0F, 0.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.45F, 12.0F, -20.5F, 1.0472F, 0.0F, 0.0F));

		PartDefinition wingRightEndrin = endrin.addOrReplaceChild("wingRightEndrin", CubeListBuilder.create().texOffs(112, 128).addBox(-6.0F, 0.0F, -5.0F, 16.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.0F, -15.0F, -17.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition wingRightEndrin2 = wingRightEndrin.addOrReplaceChild("wingRightEndrin2", CubeListBuilder.create().texOffs(122, 143).addBox(-6.0F, -0.5F, -5.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingRightEndrin3 = wingRightEndrin2.addOrReplaceChild("wingRightEndrin3", CubeListBuilder.create().texOffs(122, 150).addBox(-5.5F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition propellerRight = wingRightEndrin.addOrReplaceChild("propellerRight", CubeListBuilder.create().texOffs(121, 157).addBox(-1.0F, -2.0F, -6.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition propellerRight2 = propellerRight.addOrReplaceChild("propellerRight2", CubeListBuilder.create().texOffs(117, 174).addBox(-6.0F, -7.0F, -6.1F, 13.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingLeftEndrin = endrin.addOrReplaceChild("wingLeftEndrin", CubeListBuilder.create().texOffs(112, 128).addBox(-6.0F, 0.0F, -5.0F, 16.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(23.0F, -15.0F, -17.0F));

		PartDefinition wingLeftEndrin2 = wingLeftEndrin.addOrReplaceChild("wingLeftEndrin2", CubeListBuilder.create().texOffs(122, 143).addBox(-6.0F, -0.5F, -5.0F, 16.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingLeftEndrin3 = wingLeftEndrin2.addOrReplaceChild("wingLeftEndrin3", CubeListBuilder.create().texOffs(122, 150).addBox(-5.5F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition propellerLeft = wingLeftEndrin.addOrReplaceChild("propellerLeft", CubeListBuilder.create().texOffs(121, 157).addBox(-1.0F, -2.0F, -6.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));

		PartDefinition propellerLeft2 = propellerLeft.addOrReplaceChild("propellerLeft2", CubeListBuilder.create().texOffs(117, 174).addBox(-6.0F, -7.0F, -6.1F, 13.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingEndrin = endrin.addOrReplaceChild("wingEndrin", CubeListBuilder.create().texOffs(63, 180).addBox(-6.0F, 0.0F, -5.0F, 16.0F, 0.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -27.0F, 2.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition wingEndrin2 = wingEndrin.addOrReplaceChild("wingEndrin2", CubeListBuilder.create().texOffs(73, 195).addBox(-2.0F, -0.5F, -5.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition wingEndrin3 = wingEndrin2.addOrReplaceChild("wingEndrin3", CubeListBuilder.create().texOffs(73, 202).addBox(-5.5F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 1.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition wingEndrinSmall = wingEndrin.addOrReplaceChild("wingEndrinSmall", CubeListBuilder.create().texOffs(73, 205).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition wingEndrinSmall2 = wingEndrin.addOrReplaceChild("wingEndrinSmall2", CubeListBuilder.create().texOffs(73, 205).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 6.0F));

		PartDefinition wingEndrinSmall3 = wingEndrin.addOrReplaceChild("wingEndrinSmall3", CubeListBuilder.create().texOffs(73, 205).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 6.0F));

		PartDefinition wingEndrinSmall4 = wingEndrin.addOrReplaceChild("wingEndrinSmall4", CubeListBuilder.create().texOffs(73, 205).addBox(0.0F, -1.5F, -2.0F, 0.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 6.0F));

		PartDefinition bombsRight = body.addOrReplaceChild("bombsRight", CubeListBuilder.create().texOffs(71, 225).addBox(-9.0F, -2.0F, -7.0F, 10.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 4.0F, 0.0F));

		PartDefinition bomb = bombsRight.addOrReplaceChild("bomb", CubeListBuilder.create().texOffs(86, 248).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, -5.0F));

		PartDefinition bombWing = bomb.addOrReplaceChild("bombWing", CubeListBuilder.create().texOffs(107, 250).addBox(0.5F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, 0.0F));

		PartDefinition bombWing2 = bomb.addOrReplaceChild("bombWing2", CubeListBuilder.create().texOffs(107, 250).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bomb2 = bombsRight.addOrReplaceChild("bomb2", CubeListBuilder.create().texOffs(86, 248).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition bomb2Wing = bomb2.addOrReplaceChild("bomb2Wing", CubeListBuilder.create().texOffs(107, 250).addBox(0.5F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, 0.0F));

		PartDefinition bomb2Wing2 = bomb2.addOrReplaceChild("bomb2Wing2", CubeListBuilder.create().texOffs(107, 250).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bomb3 = bombsRight.addOrReplaceChild("bomb3", CubeListBuilder.create().texOffs(86, 248).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 5.0F));

		PartDefinition bomb3Wing = bomb3.addOrReplaceChild("bomb3Wing", CubeListBuilder.create().texOffs(107, 250).addBox(0.5F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, 0.0F));

		PartDefinition bomb3Wing2 = bomb3.addOrReplaceChild("bomb3Wing2", CubeListBuilder.create().texOffs(107, 250).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bombsLeft = body.addOrReplaceChild("bombsLeft", CubeListBuilder.create().texOffs(71, 225).addBox(-9.0F, -2.0F, -7.0F, 10.0F, 0.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0F, 4.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bomb4 = bombsLeft.addOrReplaceChild("bomb4", CubeListBuilder.create().texOffs(86, 248).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, -5.0F));

		PartDefinition bomb4Wing = bomb4.addOrReplaceChild("bomb4Wing", CubeListBuilder.create().texOffs(107, 250).addBox(0.5F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, 0.0F));

		PartDefinition bomb4Wing2 = bomb4.addOrReplaceChild("bomb4Wing2", CubeListBuilder.create().texOffs(107, 250).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bomb5 = bombsLeft.addOrReplaceChild("bomb5", CubeListBuilder.create().texOffs(86, 248).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition bomb5Wing = bomb5.addOrReplaceChild("bomb5Wing", CubeListBuilder.create().texOffs(107, 250).addBox(0.5F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, 0.0F));

		PartDefinition bomb5Wing2 = bomb5.addOrReplaceChild("bomb5Wing2", CubeListBuilder.create().texOffs(107, 250).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bomb6 = bombsLeft.addOrReplaceChild("bomb6", CubeListBuilder.create().texOffs(86, 248).addBox(-2.0F, -5.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 5.0F));

		PartDefinition bomb6Wing = bomb6.addOrReplaceChild("bomb6Wing", CubeListBuilder.create().texOffs(107, 250).addBox(0.5F, -2.0F, -1.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -5.0F, 0.0F));

		PartDefinition bomb6Wing2 = bomb6.addOrReplaceChild("bomb6Wing2", CubeListBuilder.create().texOffs(107, 250).addBox(0.0F, -1.0F, -1.5F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -6.0F, 0.5F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}