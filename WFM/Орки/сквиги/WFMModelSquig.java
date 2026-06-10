// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSquig<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wfmmodelsquig"), "main");
	private final ModelPart body;
	private final ModelPart legRight;
	private final ModelPart legLeft;

	public WFMModelSquig(ModelPart root) {
		this.body = root.getChild("body");
		this.legRight = root.getChild("legRight");
		this.legLeft = root.getChild("legLeft");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -15.0F, 16.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, 7.0F));

		PartDefinition jawTop = body.addOrReplaceChild("jawTop", CubeListBuilder.create().texOffs(84, 0).addBox(-7.0F, -4.0F, -7.0F, 14.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 1.0F, -13.0F));

		PartDefinition jawBot = body.addOrReplaceChild("jawBot", CubeListBuilder.create().texOffs(76, 47).addBox(-8.5F, -4.0F, -8.0F, 17.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 10.0F, -13.0F));

		PartDefinition tongue = jawBot.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(107, 21).addBox(-3.0F, -2.0F, -7.0F, 6.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -1.0F, -1.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition tongue2 = tongue.addOrReplaceChild("tongue2", CubeListBuilder.create().texOffs(108, 30).addBox(-3.0F, -2.0F, -7.0F, 6.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition jawBotMouth = jawBot.addOrReplaceChild("jawBotMouth", CubeListBuilder.create().texOffs(65, 38).addBox(-8.5F, -2.0F, -8.0F, 17.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

		PartDefinition ass = body.addOrReplaceChild("ass", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -3.9526F, -1.4329F, 10.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, -3.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition tail = ass.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(34, 36).addBox(2.0F, -3.6868F, -2.0746F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 50).addBox(4.0F, -3.2175F, -2.5867F, 2.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 6.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition legRight = partdefinition.addOrReplaceChild("legRight", CubeListBuilder.create().texOffs(57, 0).addBox(-2.0F, -3.5321F, -5.2856F, 6.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 11.0F, 3.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition legRight2 = legRight.addOrReplaceChild("legRight2", CubeListBuilder.create().texOffs(59, 19).addBox(-1.01F, -3.2856F, -0.4679F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition legRight3 = legRight2.addOrReplaceChild("legRight3", CubeListBuilder.create().texOffs(60, 35).addBox(-1.0F, 1.0F, -2.7321F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 1.0F, -1.9199F, 0.0F, 0.0F));

		PartDefinition clawRight = legRight3.addOrReplaceChild("clawRight", CubeListBuilder.create().texOffs(0, -3).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, -0.517F, 0.0869F, 0.1515F));

		PartDefinition clawRight2 = legRight3.addOrReplaceChild("clawRight2", CubeListBuilder.create().texOffs(0, -3).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.0F, -2.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition clawRight3 = legRight3.addOrReplaceChild("clawRight3", CubeListBuilder.create().texOffs(0, -3).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 8.0F, -2.0F, -0.517F, -0.0869F, -0.1515F));

		PartDefinition legLeft = partdefinition.addOrReplaceChild("legLeft", CubeListBuilder.create().texOffs(57, 0).addBox(-2.0F, -3.5321F, -5.2856F, 6.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.0F, 11.0F, 3.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition legLeft2 = legLeft.addOrReplaceChild("legLeft2", CubeListBuilder.create().texOffs(59, 19).addBox(-0.99F, -3.2856F, -0.4679F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition legLeft3 = legLeft2.addOrReplaceChild("legLeft3", CubeListBuilder.create().texOffs(60, 35).addBox(-1.0F, 1.0F, -2.7321F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, 1.0F, -1.9199F, 0.0F, 0.0F));

		PartDefinition clawLeft = legLeft3.addOrReplaceChild("clawLeft", CubeListBuilder.create().texOffs(0, -3).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.0F, -2.0F, -0.517F, 0.0869F, 0.1515F));

		PartDefinition clawLeft2 = legLeft3.addOrReplaceChild("clawLeft2", CubeListBuilder.create().texOffs(0, -3).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.0F, -2.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition clawLeft3 = legLeft3.addOrReplaceChild("clawLeft3", CubeListBuilder.create().texOffs(0, -3).addBox(-1.0F, -2.0F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 8.0F, -2.0F, -0.517F, -0.0869F, -0.1515F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legRight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legLeft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}