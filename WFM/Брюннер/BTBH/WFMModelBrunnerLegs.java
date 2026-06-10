// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBrunnerLegs extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer crossbow;
	private final ModelRenderer crossbowBolt;
	private final ModelRenderer saltPounch;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg_r2;
	private final ModelRenderer crossbowColchan;
	private final ModelRenderer crossbowBolt2;
	private final ModelRenderer crossbowBolt3;
	private final ModelRenderer crossbowBolt4;
	private final ModelRenderer crossbowBolt5;
	private final ModelRenderer crossbowBolt6;

	public WFMModelBrunnerLegs() {
		texWidth = 64;
		texHeight = 64;

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(-2.9F, 12.0F, 0.0F);
		RightLeg.texOffs(0, 16).addBox(-1.6F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.55F, true);

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setPos(0.0F, -1.0F, 0.0F);
		RightLeg.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0F, 0.0F, 0.0436F);
		RightLeg_r1.texOffs(0, 0).addBox(-1.6F, 1.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.7F, true);

		crossbow = new ModelRenderer(this);
		crossbow.setPos(-5.0F, 3.0F, 0.0F);
		RightLeg.addChild(crossbow);
		setRotationAngle(crossbow, -2.3734F, -0.1298F, 0.132F);
		crossbow.texOffs(0, 28).addBox(0.0F, -9.0F, -9.0F, 0.0F, 18.0F, 18.0F, -2.0F, false);

		crossbowBolt = new ModelRenderer(this);
		crossbowBolt.setPos(0.2091F, -2.7937F, 1.2966F);
		crossbow.addChild(crossbowBolt);
		crossbowBolt.texOffs(40, 40).addBox(-0.6F, -4.7063F, -6.0F, 0.0F, 12.0F, 12.0F, -2.0F, false);

		saltPounch = new ModelRenderer(this);
		saltPounch.setPos(1.13F, 0.0123F, 3.9128F);
		RightLeg.addChild(saltPounch);
		setRotationAngle(saltPounch, 0.0873F, 0.0F, 0.1309F);
		saltPounch.texOffs(54, 0).addBox(-2.0F, -1.0F, -1.5F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		saltPounch.texOffs(57, 6).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(2.9F, 12.0F, 0.0F);
		LeftLeg.texOffs(0, 16).addBox(-3.4F, 0.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.55F, false);

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setPos(0.0F, -1.0F, 0.0F);
		LeftLeg.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0F, 0.0F, -0.0436F);
		RightLeg_r2.texOffs(0, 0).addBox(-3.4F, 1.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.7F, false);

		crossbowColchan = new ModelRenderer(this);
		crossbowColchan.setPos(3.0627F, 3.0F, 1.4103F);
		LeftLeg.addChild(crossbowColchan);
		setRotationAngle(crossbowColchan, 0.0797F, -0.7383F, -0.1181F);
		crossbowColchan.texOffs(49, 12).addBox(-2.0F, -3.0F, -1.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		crossbowBolt2 = new ModelRenderer(this);
		crossbowBolt2.setPos(-1.5994F, -0.087F, -1.0568F);
		crossbowColchan.addChild(crossbowBolt2);
		setRotationAngle(crossbowBolt2, -0.8091F, -0.052F, -0.2135F);
		crossbowBolt2.texOffs(40, 40).addBox(-0.6F, -5.7064F, -5.0F, 0.0F, 12.0F, 12.0F, -2.0F, false);

		crossbowBolt3 = new ModelRenderer(this);
		crossbowBolt3.setPos(-1.5122F, -1.0832F, -1.0568F);
		crossbowColchan.addChild(crossbowBolt3);
		setRotationAngle(crossbowBolt3, -0.8091F, -0.052F, -0.2135F);
		crossbowBolt3.texOffs(40, 40).addBox(-0.6F, -5.7063F, -5.0F, 0.0F, 12.0F, 12.0F, -2.0F, false);

		crossbowBolt4 = new ModelRenderer(this);
		crossbowBolt4.setPos(-2.1853F, -1.1421F, -1.7941F);
		crossbowColchan.addChild(crossbowBolt4);
		setRotationAngle(crossbowBolt4, -0.8091F, -0.052F, -0.2135F);
		crossbowBolt4.texOffs(40, 40).addBox(-0.6F, -5.7064F, -5.0F, 0.0F, 12.0F, 12.0F, -2.0F, false);

		crossbowBolt5 = new ModelRenderer(this);
		crossbowBolt5.setPos(-2.0981F, -2.1383F, -1.7941F);
		crossbowColchan.addChild(crossbowBolt5);
		setRotationAngle(crossbowBolt5, -0.8091F, -0.052F, -0.2135F);
		crossbowBolt5.texOffs(40, 40).addBox(-0.6F, -5.7063F, -5.0F, 0.0F, 12.0F, 12.0F, -2.0F, false);

		crossbowBolt6 = new ModelRenderer(this);
		crossbowBolt6.setPos(-1.3379F, -3.0756F, -1.0568F);
		crossbowColchan.addChild(crossbowBolt6);
		setRotationAngle(crossbowBolt6, -0.8091F, -0.052F, -0.2135F);
		crossbowBolt6.texOffs(40, 40).addBox(-0.6F, -5.7063F, -5.0F, 0.0F, 12.0F, 12.0F, -2.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}