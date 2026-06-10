// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenWarlordLegs extends EntityModel<Entity> {
	private final ModelRenderer rightLeg;
	private final ModelRenderer spike_r1;
	private final ModelRenderer rightLegFur_r1;
	private final ModelRenderer rightLeg_r1;
	private final ModelRenderer leftLeg;
	private final ModelRenderer spike_r2;
	private final ModelRenderer leftLegFur_r1;
	private final ModelRenderer leftLeg_r1;

	public WFMModelSkavenWarlordLegs() {
		texWidth = 64;
		texHeight = 64;

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(-3.0F, 12.0F, 0.0F);
		setRotationAngle(rightLeg, 0.1745F, 0.0F, 0.0F);
		

		spike_r1 = new ModelRenderer(this);
		spike_r1.setPos(10.0F, 0.0F, 0.0F);
		rightLeg.addChild(spike_r1);
		setRotationAngle(spike_r1, -0.583F, 0.6956F, -0.3999F);
		spike_r1.texOffs(0, -5).addBox(-7.0F, 2.0F, -16.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);

		rightLegFur_r1 = new ModelRenderer(this);
		rightLegFur_r1.setPos(-0.1F, -1.0F, 0.0F);
		rightLeg.addChild(rightLegFur_r1);
		setRotationAngle(rightLegFur_r1, -0.436F, 0.0184F, 0.0395F);
		rightLegFur_r1.texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.7F, true);

		rightLeg_r1 = new ModelRenderer(this);
		rightLeg_r1.setPos(-0.1F, -1.0F, 0.0F);
		rightLeg.addChild(rightLeg_r1);
		setRotationAngle(rightLeg_r1, -0.4363F, 0.0F, 0.0F);
		rightLeg_r1.texOffs(0, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.25F, true);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(3.0F, 12.0F, 0.0F);
		setRotationAngle(leftLeg, 0.1745F, 0.0F, 0.0F);
		

		spike_r2 = new ModelRenderer(this);
		spike_r2.setPos(4.0F, 0.0F, 0.0F);
		leftLeg.addChild(spike_r2);
		setRotationAngle(spike_r2, -0.583F, -0.6956F, 0.3999F);
		spike_r2.texOffs(0, -5).addBox(-3.0F, 2.0F, -6.0F, 0.0F, 5.0F, 5.0F, 0.0F, false);

		leftLegFur_r1 = new ModelRenderer(this);
		leftLegFur_r1.setPos(-0.1F, -1.0F, 0.0F);
		leftLeg.addChild(leftLegFur_r1);
		setRotationAngle(leftLegFur_r1, -0.436F, -0.0184F, -0.0395F);
		leftLegFur_r1.texOffs(0, 41).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.7F, false);

		leftLeg_r1 = new ModelRenderer(this);
		leftLeg_r1.setPos(-0.1F, -1.0F, 0.0F);
		leftLeg.addChild(leftLeg_r1);
		setRotationAngle(leftLeg_r1, -0.4363F, 0.0F, 0.0F);
		leftLeg_r1.texOffs(0, 13).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}