// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelStegadon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "wfmmodelstegadon"), "main");
	private final ModelPart Tail;
	private final ModelPart Body;
	private final ModelPart Leg2;
	private final ModelPart Leg3;
	private final ModelPart Head;
	private final ModelPart Leg4;
	private final ModelPart Rug;
	private final ModelPart Leg1;

	public WFMModelStegadon(ModelPart root) {
		this.Tail = root.getChild("Tail");
		this.Body = root.getChild("Body");
		this.Leg2 = root.getChild("Leg2");
		this.Leg3 = root.getChild("Leg3");
		this.Head = root.getChild("Head");
		this.Leg4 = root.getChild("Leg4");
		this.Rug = root.getChild("Rug");
		this.Leg1 = root.getChild("Leg1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(218, 0).addBox(0.0F, 0.0F, 0.0F, 18.0F, 10.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -14.0F, 23.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition TailChild = Tail.addOrReplaceChild("TailChild", CubeListBuilder.create().texOffs(312, 0).addBox(0.0F, 0.0F, 0.0F, 12.0F, 6.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 1.0F, 25.0F, 0.0744F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 26.0F, 20.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, -8.0F, -8.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = Body.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(0, 89).addBox(10.0F, 0.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 6.0F, -12.0F));

		PartDefinition body_front = Body.addOrReplaceChild("body_front", CubeListBuilder.create().texOffs(0, 57).addBox(10.0F, 0.0F, -6.0F, 18.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 4.0F, -6.0F));

		PartDefinition Leg2 = partdefinition.addOrReplaceChild("Leg2", CubeListBuilder.create().texOffs(112, 67).addBox(0.0F, -6.0F, 0.0F, 6.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(13.0F, 0.0F, 14.0F));

		PartDefinition Leg2Child = Leg2.addOrReplaceChild("Leg2Child", CubeListBuilder.create().texOffs(112, 91).addBox(0.0F, 0.0F, -1.0F, 6.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 2.0F, 0.4098F, 0.0F, 0.0F));

		PartDefinition Leg2ChildChild = Leg2Child.addOrReplaceChild("Leg2ChildChild", CubeListBuilder.create().texOffs(112, 110).addBox(13.0F, -11.0F, 9.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 8.3F, -12.0F, -0.8652F, 0.0F, 0.0F));

		PartDefinition Leg2ChildChildChild = Leg2ChildChild.addOrReplaceChild("Leg2ChildChildChild", CubeListBuilder.create().texOffs(112, 126).addBox(12.5F, -13.5F, -5.0F, 7.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8F, 4.4F, -1.1383F, 0.0F, 0.0F));

		PartDefinition Leg3 = partdefinition.addOrReplaceChild("Leg3", CubeListBuilder.create().texOffs(112, 67).addBox(0.0F, 0.0F, 0.0F, 6.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, 0.0F, -17.0F));

		PartDefinition Leg3Child = Leg3.addOrReplaceChild("Leg3Child", CubeListBuilder.create().texOffs(112, 91).addBox(0.0F, 0.0F, 0.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 0.0F, 0.4098F, 0.0F, 0.0F));

		PartDefinition Leg3ChildChild = Leg3Child.addOrReplaceChild("Leg3ChildChild", CubeListBuilder.create().texOffs(112, 110).addBox(0.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(15.0F, 8.3F, 19.0F, -0.8652F, 0.0F, 0.0F));

		PartDefinition Leg3ChildChildChild = Leg3ChildChild.addOrReplaceChild("Leg3ChildChildChild", CubeListBuilder.create().texOffs(112, 126).addBox(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.8F, 4.4F, -1.1383F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 150).addBox(-8.0F, -8.0F, -11.0F, 16.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, -28.0F));

		PartDefinition mouth = Head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(0, 125).addBox(-10.0F, -8.0F, -9.0F, 9.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 5.0F, -7.0F, 0.0744F, 0.0F, 0.0F));

		PartDefinition horn_left = Head.addOrReplaceChild("horn_left", CubeListBuilder.create().texOffs(0, 224).addBox(-10.0F, 12.0F, -2.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, -5.0F, 15.4F, -1.9705F, 0.0F, 0.0F));

		PartDefinition horn_right = Head.addOrReplaceChild("horn_right", CubeListBuilder.create().texOffs(0, 224).addBox(-10.0F, 12.0F, -2.0F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -5.0F, 15.4F, -1.9705F, 0.0F, 0.0F));

		PartDefinition horn_middle_top = Head.addOrReplaceChild("horn_middle_top", CubeListBuilder.create().texOffs(0, 224).addBox(-19.0F, 12.5F, 10.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.5F, -3.4F, 15.4F, -2.4131F, 0.0F, 0.0F));

		PartDefinition horn_middle_top_1 = horn_middle_top.addOrReplaceChild("horn_middle_top_1", CubeListBuilder.create().texOffs(0, 224).addBox(-19.0F, 15.0F, 15.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4F, 0.5F, -0.3187F, 0.0F, 0.0F));

		PartDefinition cluv = Head.addOrReplaceChild("cluv", CubeListBuilder.create().texOffs(0, 125).addBox(-8.7F, -7.0F, -1.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 5.0F, -10.0F, 0.7854F, -0.5918F, -0.5009F));

		PartDefinition horn_middle_bot = Head.addOrReplaceChild("horn_middle_bot", CubeListBuilder.create().texOffs(0, 224).addBox(-19.0F, 12.5F, 10.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.6F, 1.2F, 7.5F, -2.4131F, 0.0F, 0.0F));

		PartDefinition horn_middle_bot_1 = horn_middle_bot.addOrReplaceChild("horn_middle_bot_1", CubeListBuilder.create().texOffs(0, 224).addBox(-19.0F, 15.0F, 15.9F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.4F, 0.5F, -0.3187F, 0.0F, 0.0F));

		PartDefinition greben = Head.addOrReplaceChild("greben", CubeListBuilder.create().texOffs(0, 186).addBox(-8.5F, -2.0F, -12.4F, 28.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -10.7F, 19.6F, -0.67F, 0.0F, 0.0F));

		PartDefinition Leg4 = partdefinition.addOrReplaceChild("Leg4", CubeListBuilder.create().texOffs(112, 67).addBox(0.0F, -6.0F, 0.0F, 6.0F, 15.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-19.0F, 0.0F, 14.0F));

		PartDefinition leg4_1 = Leg4.addOrReplaceChild("leg4_1", CubeListBuilder.create().texOffs(112, 91).addBox(0.0F, 0.0F, -1.0F, 6.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 2.0F, 0.4098F, 0.0F, 0.0F));

		PartDefinition Leg4ChildChild = leg4_1.addOrReplaceChild("Leg4ChildChild", CubeListBuilder.create().texOffs(112, 110).addBox(-19.0F, -10.0F, 9.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 8.3F, -12.0F, -0.8652F, 0.0F, 0.0F));

		PartDefinition Leg4ChildChildChild = Leg4ChildChild.addOrReplaceChild("Leg4ChildChildChild", CubeListBuilder.create().texOffs(112, 126).addBox(-19.5F, -13.5F, 0.0F, 7.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 2.4F, -1.1383F, 0.0F, 0.0F));

		PartDefinition Rug = partdefinition.addOrReplaceChild("Rug", CubeListBuilder.create().texOffs(125, 0).addBox(0.0F, 0.0F, 0.0F, 20.0F, 7.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0F, -13.0F, -2.0F, 0.0436F, 0.0F, 0.0F));

		PartDefinition Leg1 = partdefinition.addOrReplaceChild("Leg1", CubeListBuilder.create().texOffs(112, 67).addBox(0.0F, 0.0F, 0.0F, 6.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -0.1F, -17.0F));

		PartDefinition Leg1Child = Leg1.addOrReplaceChild("Leg1Child", CubeListBuilder.create().texOffs(112, 91).addBox(0.0F, 0.0F, 0.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 5.5F, 1.0F, 0.4098F, 0.0F, 0.0F));

		PartDefinition Leg1ChildChild = Leg1Child.addOrReplaceChild("Leg1ChildChild", CubeListBuilder.create().texOffs(112, 110).addBox(0.0F, 0.0F, 0.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 8.4F, 19.0F, -0.8652F, 0.0F, 0.0F));

		PartDefinition Leg1ChildChildChild = Leg1ChildChild.addOrReplaceChild("Leg1ChildChildChild", CubeListBuilder.create().texOffs(112, 126).addBox(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, 3.4F, -1.1383F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Rug.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}