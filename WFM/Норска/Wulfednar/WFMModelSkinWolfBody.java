// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkinWolfBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body1;
	private final ModelRenderer dick_cape2;
	private final ModelRenderer rightArm;
	private final ModelRenderer hand_right3;
	private final ModelRenderer claws_right2;
	private final ModelRenderer claw_right4;
	private final ModelRenderer claw_right5;
	private final ModelRenderer claw_right6;
	private final ModelRenderer leftArm;
	private final ModelRenderer hand_left3;
	private final ModelRenderer claws_left2;
	private final ModelRenderer claw_left4;
	private final ModelRenderer claw_left5;
	private final ModelRenderer claw_left6;

	public WFMModelSkinWolfBody() {
		texWidth = 256;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, -2.0F, -1.1F);
		

		body1 = new ModelRenderer(this);
		body1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(body1);
		setRotationAngle(body1, 0.182F, 0.0F, 0.0F);
		body1.texOffs(0, 24).addBox(-6.0F, -26.7536F, -5.6003F, 13.0F, 33.0F, 10.0F, 1.1F, false);
		body1.texOffs(46, 24).addBox(-6.0F, -26.7536F, -5.6003F, 13.0F, 33.0F, 10.0F, 0.75F, false);

		dick_cape2 = new ModelRenderer(this);
		dick_cape2.setPos(0.6111F, 8.8104F, -8.8853F);
		body1.addChild(dick_cape2);
		setRotationAngle(dick_cape2, -0.1745F, 0.0F, 0.0F);
		dick_cape2.texOffs(0, 71).addBox(-6.5F, -13.4999F, 0.015F, 13.0F, 19.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-6.0F, -23.0F, -5.0F);
		rightArm.texOffs(133, 0).addBox(-8.134F, -4.7679F, -5.0F, 8.0F, 8.0F, 9.0F, 0.5F, false);
		rightArm.texOffs(167, 0).addBox(-8.134F, -4.7679F, -5.0F, 8.0F, 8.0F, 9.0F, 0.7F, false);

		hand_right3 = new ModelRenderer(this);
		hand_right3.setPos(-9.134F, 6.2321F, 0.0F);
		rightArm.addChild(hand_right3);
		hand_right3.texOffs(133, 19).addBox(-1.0F, -7.0F, -4.0F, 7.0F, 24.0F, 7.0F, 0.5F, false);
		hand_right3.texOffs(167, 19).addBox(-1.0F, -7.0F, -4.0F, 7.0F, 24.0F, 7.0F, 0.7F, false);

		claws_right2 = new ModelRenderer(this);
		claws_right2.setPos(2.5F, 13.5F, -0.5F);
		hand_right3.addChild(claws_right2);
		setRotationAngle(claws_right2, 1.5708F, 0.0F, 0.0F);
		claws_right2.texOffs(0, 96).addBox(-3.5F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);

		claw_right4 = new ModelRenderer(this);
		claw_right4.setPos(-3.5F, -4.5F, -7.5F);
		claws_right2.addChild(claw_right4);
		setRotationAngle(claw_right4, 0.0F, 0.1745F, 0.0F);
		claw_right4.texOffs(0, 106).addBox(0.0F, -5.0F, -7.0F, 0.0F, 10.0F, 12.0F, 0.0F, false);

		claw_right5 = new ModelRenderer(this);
		claw_right5.setPos(0.5F, -4.5F, -7.5F);
		claws_right2.addChild(claw_right5);
		claw_right5.texOffs(0, 106).addBox(-0.366F, -5.0F, -7.0F, 0.0F, 10.0F, 12.0F, 0.0F, false);

		claw_right6 = new ModelRenderer(this);
		claw_right6.setPos(4.5F, -4.5F, -7.5F);
		claws_right2.addChild(claw_right6);
		setRotationAngle(claw_right6, 0.0F, -0.1745F, 0.0F);
		claw_right6.texOffs(0, 106).addBox(-0.866F, -5.0F, -7.0F, 0.0F, 10.0F, 12.0F, 0.0F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(13.0F, -24.0F, -5.0F);
		leftArm.texOffs(133, 0).addBox(-6.134F, -3.7679F, -4.0F, 8.0F, 8.0F, 9.0F, 0.5F, true);
		leftArm.texOffs(167, 0).addBox(-6.134F, -3.7679F, -4.0F, 8.0F, 8.0F, 9.0F, 0.7F, true);

		hand_left3 = new ModelRenderer(this);
		hand_left3.setPos(-3.134F, 7.2321F, 1.0F);
		leftArm.addChild(hand_left3);
		hand_left3.texOffs(133, 19).addBox(0.0F, -7.0F, -4.0F, 7.0F, 24.0F, 7.0F, 0.5F, true);
		hand_left3.texOffs(167, 19).addBox(0.0F, -7.0F, -4.0F, 7.0F, 24.0F, 7.0F, 0.7F, true);

		claws_left2 = new ModelRenderer(this);
		claws_left2.setPos(3.5F, 13.5F, -0.5F);
		hand_left3.addChild(claws_left2);
		setRotationAngle(claws_left2, -1.5708F, 0.0F, 3.1416F);
		claws_left2.texOffs(0, 96).addBox(-3.5F, -3.5F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, true);

		claw_left4 = new ModelRenderer(this);
		claw_left4.setPos(-3.5F, -4.5F, -7.5F);
		claws_left2.addChild(claw_left4);
		setRotationAngle(claw_left4, 0.0F, 0.1745F, 0.0F);
		claw_left4.texOffs(0, 106).addBox(0.0F, 4.0F, -7.0F, 0.0F, 10.0F, 12.0F, 0.0F, true);

		claw_left5 = new ModelRenderer(this);
		claw_left5.setPos(0.5F, -4.5F, -7.5F);
		claws_left2.addChild(claw_left5);
		claw_left5.texOffs(0, 106).addBox(-0.366F, 4.0F, -7.0F, 0.0F, 10.0F, 12.0F, 0.0F, true);

		claw_left6 = new ModelRenderer(this);
		claw_left6.setPos(4.5F, -4.5F, -7.5F);
		claws_left2.addChild(claw_left6);
		setRotationAngle(claw_left6, 0.0F, -0.1745F, 0.0F);
		claw_left6.texOffs(0, 106).addBox(-0.866F, 4.0F, -7.0F, 0.0F, 10.0F, 12.0F, 0.0F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}