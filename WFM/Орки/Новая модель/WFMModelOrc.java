// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOrc extends EntityModel<Entity> {
	private final ModelRenderer bipedBody;
	private final ModelRenderer bipedBody2;
	private final ModelRenderer bipedRightArm;
	private final ModelRenderer bipedRightArm2;
	private final ModelRenderer bipedLeftArm;
	private final ModelRenderer bipedLeftArm2;
	private final ModelRenderer bipedRightLeg;
	private final ModelRenderer bipedRightLeg_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer feet_r1;
	private final ModelRenderer bipedLeftLeg;
	private final ModelRenderer bipedLeftLeg_r1;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer feet_r2;
	private final ModelRenderer bipedHead;
	private final ModelRenderer jaw;
	private final ModelRenderer fang_r1;
	private final ModelRenderer fang_r2;
	private final ModelRenderer earRight;
	private final ModelRenderer earLeft;
	private final ModelRenderer jawTop;
	private final ModelRenderer jaw_r1;
	private final ModelRenderer brov;
	private final ModelRenderer brov2;
	private final ModelRenderer glaz_left;
	private final ModelRenderer glaz_left2;

	public WFMModelOrc() {
		texWidth = 64;
		texHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setPos(0.0F, 4.0F, 0.0F);
		bipedBody.texOffs(26, 17).addBox(-6.0F, -10.0F, -3.5F, 12.0F, 11.0F, 7.0F, 0.8F, false);

		bipedBody2 = new ModelRenderer(this);
		bipedBody2.setPos(0.0F, 0.0F, 0.0F);
		bipedBody.addChild(bipedBody2);
		bipedBody2.texOffs(26, 17).addBox(-6.0F, -10.0F, -3.5F, 12.0F, 16.0F, 7.0F, 0.0F, false);

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setPos(-6.9564F, -2.999F, 0.0F);
		setRotationAngle(bipedRightArm, 0.0F, 0.0F, 0.0436F);
		bipedRightArm.texOffs(15, 50).addBox(-4.8693F, -2.0048F, -3.4981F, 6.0F, 7.0F, 7.0F, 0.5F, false);

		bipedRightArm2 = new ModelRenderer(this);
		bipedRightArm2.setPos(0.0F, 0.0F, 0.0F);
		bipedRightArm.addChild(bipedRightArm2);
		setRotationAngle(bipedRightArm2, -0.0019F, 0.0436F, 0.0F);
		bipedRightArm2.texOffs(42, 48).addBox(-4.8693F, 5.9952F, -2.9981F, 5.0F, 10.0F, 6.0F, 0.5F, false);

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setPos(6.9564F, -2.999F, 0.0F);
		setRotationAngle(bipedLeftArm, 0.0F, 0.0F, -0.0436F);
		bipedLeftArm.texOffs(15, 50).addBox(-1.1307F, -2.0048F, -3.4981F, 6.0F, 7.0F, 7.0F, 0.5F, true);

		bipedLeftArm2 = new ModelRenderer(this);
		bipedLeftArm2.setPos(0.0F, 0.0F, 0.0F);
		bipedLeftArm.addChild(bipedLeftArm2);
		setRotationAngle(bipedLeftArm2, -0.0019F, -0.0436F, 0.0F);
		bipedLeftArm2.texOffs(42, 48).addBox(-0.1307F, 5.9952F, -2.9981F, 5.0F, 10.0F, 6.0F, 0.5F, true);

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setPos(-1.0F, 10.0F, 0.0F);
		setRotationAngle(bipedRightLeg, 0.0436F, 0.0F, 0.0F);
		

		bipedRightLeg_r1 = new ModelRenderer(this);
		bipedRightLeg_r1.setPos(0.0F, 2.9981F, -0.0872F);
		bipedRightLeg.addChild(bipedRightLeg_r1);
		setRotationAngle(bipedRightLeg_r1, -0.1309F, 0.0F, 0.0F);
		bipedRightLeg_r1.texOffs(0, 14).addBox(-5.5F, -2.9924F, -3.1743F, 6.0F, 7.0F, 6.0F, 0.5F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setPos(0.0F, 1.9981F, -0.0872F);
		bipedRightLeg.addChild(RightLeg);
		RightLeg.texOffs(0, 27).addBox(-5.0F, 4.0019F, -3.4128F, 5.0F, 8.0F, 5.0F, 0.5F, false);

		feet_r1 = new ModelRenderer(this);
		feet_r1.setPos(-1.0F, 11.5642F, -4.981F);
		RightLeg.addChild(feet_r1);
		setRotationAngle(feet_r1, -0.0436F, 0.0F, 0.0F);
		feet_r1.texOffs(0, 41).addBox(-4.0F, -1.0F, -1.0F, 5.0F, 2.0F, 6.0F, 0.3F, false);

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setPos(1.0F, 10.0F, 0.0F);
		setRotationAngle(bipedLeftLeg, 0.0436F, 0.0F, 0.0F);
		

		bipedLeftLeg_r1 = new ModelRenderer(this);
		bipedLeftLeg_r1.setPos(6.0F, 2.9981F, -0.0872F);
		bipedLeftLeg.addChild(bipedLeftLeg_r1);
		setRotationAngle(bipedLeftLeg_r1, -0.1309F, 0.0F, 0.0F);
		bipedLeftLeg_r1.texOffs(0, 14).addBox(-6.5F, -2.9924F, -3.1743F, 6.0F, 7.0F, 6.0F, 0.5F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(6.0F, 1.9981F, -0.0872F);
		bipedLeftLeg.addChild(LeftLeg);
		LeftLeg.texOffs(0, 27).addBox(-6.0F, 4.0019F, -3.4128F, 5.0F, 8.0F, 5.0F, 0.5F, true);

		feet_r2 = new ModelRenderer(this);
		feet_r2.setPos(-1.0F, 11.5642F, -4.981F);
		LeftLeg.addChild(feet_r2);
		setRotationAngle(feet_r2, -0.0436F, 0.0F, 0.0F);
		feet_r2.texOffs(0, 41).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 2.0F, 6.0F, 0.3F, true);

		bipedHead = new ModelRenderer(this);
		bipedHead.setPos(1.0F, -2.0F, -4.0F);
		bipedHead.texOffs(32, 0).addBox(-5.0F, -6.0F, -7.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);

		jaw = new ModelRenderer(this);
		jaw.setPos(-2.0F, 5.2164F, -6.9763F);
		bipedHead.addChild(jaw);
		setRotationAngle(jaw, 0.2182F, 0.0F, 0.0F);
		jaw.texOffs(0, 7).addBox(-3.5F, -3.9526F, -1.5671F, 9.0F, 3.0F, 4.0F, 0.2F, false);
		jaw.texOffs(0, 0).addBox(-2.0F, -4.9526F, -1.0671F, 6.0F, 2.0F, 0.0F, 0.0F, false);

		fang_r1 = new ModelRenderer(this);
		fang_r1.setPos(3.5F, -3.0F, -1.5F);
		jaw.addChild(fang_r1);
		setRotationAngle(fang_r1, 0.0F, -2.7489F, 0.0F);
		fang_r1.texOffs(0, 2).addBox(-1.7582F, -3.9526F, -0.7826F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		fang_r2 = new ModelRenderer(this);
		fang_r2.setPos(-1.5F, -3.0F, -1.5F);
		jaw.addChild(fang_r2);
		setRotationAngle(fang_r2, 0.0F, -0.5672F, 0.0F);
		fang_r2.texOffs(0, 2).addBox(-1.7674F, -3.9526F, 0.3651F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		earRight = new ModelRenderer(this);
		earRight.setPos(3.0F, 0.0F, -5.0F);
		bipedHead.addChild(earRight);
		setRotationAngle(earRight, 0.0F, 0.4363F, 0.0F);
		earRight.texOffs(30, -5).addBox(0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);

		earLeft = new ModelRenderer(this);
		earLeft.setPos(-5.0F, 0.0F, -5.0F);
		bipedHead.addChild(earLeft);
		setRotationAngle(earLeft, 0.0F, -0.4363F, 0.0F);
		earLeft.texOffs(30, -5).addBox(0.0F, -7.0F, 0.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);

		jawTop = new ModelRenderer(this);
		jawTop.setPos(-1.0F, 0.5F, -6.0F);
		bipedHead.addChild(jawTop);
		setRotationAngle(jawTop, -0.1745F, 0.0F, 0.0F);
		

		jaw_r1 = new ModelRenderer(this);
		jaw_r1.setPos(-1.0F, 0.5F, 0.0F);
		jawTop.addChild(jaw_r1);
		setRotationAngle(jaw_r1, 0.0873F, 0.0F, 0.0F);
		jaw_r1.texOffs(17, 0).addBox(-1.5F, -3.5F, -2.1736F, 5.0F, 3.0F, 4.0F, 0.2F, false);

		brov = new ModelRenderer(this);
		brov.setPos(-3.0F, -2.5F, -8.0F);
		bipedHead.addChild(brov);
		setRotationAngle(brov, 0.0F, 0.0F, 0.2182F);
		brov.texOffs(56, 0).addBox(-1.4329F, -2.4526F, 0.4F, 2.0F, 1.0F, 0.0F, 0.0F, false);

		brov2 = new ModelRenderer(this);
		brov2.setPos(1.0F, -2.5F, -8.0F);
		bipedHead.addChild(brov2);
		setRotationAngle(brov2, 0.0F, 0.0F, -0.2182F);
		brov2.texOffs(56, 2).addBox(-0.5671F, -2.4526F, 0.4F, 2.0F, 1.0F, 0.0F, 0.0F, true);

		glaz_left = new ModelRenderer(this);
		glaz_left.setPos(1.0436F, -1.501F, -8.0F);
		bipedHead.addChild(glaz_left);
		glaz_left.texOffs(56, 3).addBox(-1.0436F, -2.799F, 0.65F, 2.0F, 1.0F, 0.0F, -0.2F, true);

		glaz_left2 = new ModelRenderer(this);
		glaz_left2.setPos(-2.9564F, -1.501F, -8.0F);
		bipedHead.addChild(glaz_left2);
		glaz_left2.texOffs(56, 1).addBox(-1.0436F, -2.799F, 0.65F, 2.0F, 1.0F, 0.0F, -0.2F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bipedBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedHead.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}