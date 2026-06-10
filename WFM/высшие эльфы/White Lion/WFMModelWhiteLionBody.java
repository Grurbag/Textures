// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWhiteLionBody extends EntityModel<Entity> {
	private final ModelRenderer Body;
	private final ModelRenderer fur_r1;
	private final ModelRenderer cape;
	private final ModelRenderer LeftArm;
	private final ModelRenderer lionHead;
	private final ModelRenderer lapa_r1;
	private final ModelRenderer earRight;
	private final ModelRenderer earLeft;
	private final ModelRenderer RightArm;
	private final ModelRenderer shoulder_right;

	public WFMModelWhiteLionBody() {
		texWidth = 64;
		texHeight = 64;

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		Body.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.texOffs(16, 0).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.8F, false);
		Body.texOffs(58, 16).addBox(-1.5F, 1.0F, -2.79F, 3.0F, 12.0F, 0.0F, 0.0F, false);

		fur_r1 = new ModelRenderer(this);
		fur_r1.setPos(6.0F, 0.0F, 4.4F);
		Body.addChild(fur_r1);
		setRotationAngle(fur_r1, 0.0F, -0.0873F, 0.0F);
		fur_r1.texOffs(18, 33).addBox(-13.0F, -2.0F, -1.5F, 14.0F, 4.0F, 3.0F, 0.0F, false);

		cape = new ModelRenderer(this);
		cape.setPos(0.0F, 0.0F, 0.0F);
		Body.addChild(cape);
		cape.texOffs(36, 44).addBox(-7.0F, 1.0F, 4.0F, 14.0F, 20.0F, 0.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 2.0F, 0.0F);
		LeftArm.texOffs(40, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, false);
		LeftArm.texOffs(0, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, false);

		lionHead = new ModelRenderer(this);
		lionHead.setPos(4.0951F, 0.9067F, 0.5F);
		LeftArm.addChild(lionHead);
		setRotationAngle(lionHead, 0.0F, 0.0F, -2.9234F);
		lionHead.texOffs(0, 33).addBox(-3.7207F, -0.4837F, -2.5F, 3.0F, 4.0F, 6.0F, 0.0F, false);
		lionHead.texOffs(0, 43).addBox(-0.7207F, -0.4837F, -4.0F, 6.0F, 7.0F, 9.0F, 0.0F, false);
		lionHead.texOffs(69, 46).addBox(1.2793F, -1.4837F, -4.0F, 5.0F, 9.0F, 9.0F, 0.5F, false);
		lionHead.texOffs(0, 9).addBox(-3.9293F, 1.8858F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		lionHead.texOffs(0, 0).addBox(-3.2293F, -2.4837F, 3.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);
		lionHead.texOffs(0, 0).addBox(-3.2293F, -2.4837F, -2.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);
		lionHead.texOffs(0, -2).addBox(-3.2293F, -2.4837F, -2.0F, 0.0F, 3.0F, 5.0F, 0.0F, false);

		lapa_r1 = new ModelRenderer(this);
		lapa_r1.setPos(4.2793F, -5.9837F, -3.5F);
		lionHead.addChild(lapa_r1);
		setRotationAngle(lapa_r1, 0.0F, 0.0F, -0.2618F);
		lapa_r1.texOffs(48, 0).addBox(-5.0F, -4.5F, -1.0F, 6.0F, 11.0F, 0.0F, 0.0F, false);

		earRight = new ModelRenderer(this);
		earRight.setPos(0.0F, 0.0F, 0.0F);
		lionHead.addChild(earRight);
		earRight.texOffs(10, 0).addBox(0.0F, 6.0F, -3.0F, 3.0F, 3.0F, 1.0F, -0.2F, false);

		earLeft = new ModelRenderer(this);
		earLeft.setPos(1.5F, 6.5F, 3.5F);
		lionHead.addChild(earLeft);
		setRotationAngle(earLeft, 3.1416F, 0.0F, -3.1416F);
		earLeft.texOffs(10, 0).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 3.0F, 1.0F, -0.2F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setPos(-5.0F, 2.0F, 0.0F);
		RightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.49F, true);
		RightArm.texOffs(0, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.69F, true);

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setPos(-2.4914F, -2.3695F, 0.0F);
		RightArm.addChild(shoulder_right);
		setRotationAngle(shoulder_right, 0.0F, 0.0F, -0.5236F);
		shoulder_right.texOffs(76, 0).addBox(-2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}